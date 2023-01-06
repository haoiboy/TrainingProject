package day02;

public class ThreadlocalDemo {
    public static void main(String[] args) {
        ThreadLocal<String> stringThreadLocal = new ThreadLocal<>();
        stringThreadLocal.set("mayikt1");
        //ThreadLocalMap与堆内存中的ThreadLocal断开引用
        stringThreadLocal.remove();
        //stringThreadLocal1与堆内存中的ThreadLocal断开引用
        stringThreadLocal=null;
        //GCRoot引用链就会发现ThreadLocal 没有被任何人引用 则会清理掉该对象 避免内存泄漏的问题
        Thread thread = Thread.currentThread();
        System.out.println(thread);

    }
}
