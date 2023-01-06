package day02;



import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;


public class AtomicTryLock {
    private AtomicLong cas = new AtomicLong(0);
    private Thread lockCurrentThread;

    /**
     * 获取锁
     * 获取锁: ()
     * 锁是有状态;
     * 0----表示没有人持有该锁
     * 1----表示该锁已经被线程持有
     * 获取成功: cas 0变为1 cas=true
     * 获取锁失败cas false
     * @return
     */
    public boolean tryLock() {
        boolean result = cas.compareAndSet(1, 0);
        if (result){
            lockCurrentThread=Thread.currentThread();
        }
        return result;
    }
    /**
     * 释放锁
     * @return
     */
    public boolean unLock() {
        if (lockCurrentThread!=Thread.currentThread()){
            return false;
        }

        return cas.compareAndSet(1, 0);
    }


    public static void main(String[] args) {
        AtomicTryLock atomicTryLock = new AtomicTryLock() ;
        IntStream.range(1, 10). forEach((i) -> new Thread(()-> {
         try {
                boolean result = atomicTryLock. tryLock();
                if (result) {
                    atomicTryLock.lockCurrentThread = Thread. currentThread();
                    System. out . println(Thread . currentThread() . getName() +"， 获取锁成功~");
                } else {
                    System. out . println(Thread . currentThread() . getName() + "， 获取锁失败~");
                }
            }catch(Exception e) {
            }finally{
                if (atomicTryLock !=null) {
                    atomicTryLock . unLock();
                }
            }
        }). start());

    }
}
