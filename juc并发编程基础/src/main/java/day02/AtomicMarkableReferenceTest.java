package day02;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicMarkableReferenceTest {
    private static final  Integer INTT_MUN=1000;
    private static final    Integer UPDATE_NUM=1000;
    private static final    Integer TEM_MUN=1000;
    private static AtomicStampedReference atomicStampedReference=new AtomicStampedReference(INTT_MUN,1);

    public static void main(String[] args) {
        new Thread(() -> {
            Integer value=(Integer)atomicStampedReference.getReference();
            int stamp=atomicStampedReference.getStamp();
            System.out.println(Thread.currentThread().getName()+":当前值为"+value+"版本号为:"+stamp);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if (atomicStampedReference.compareAndSet(value,UPDATE_NUM,0,stamp+1)){
                System.out.println(Thread.currentThread().getName()+":当前值为"+atomicStampedReference.getReference()+"版本号为："+atomicStampedReference.getStamp());

            }else {
                System.out.println("版本号不同，更新失败");
            }
        },"线程A").start();
    }
}
