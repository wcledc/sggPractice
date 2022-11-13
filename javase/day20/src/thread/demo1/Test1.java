package thread.demo1;

/* 线程开启方式2:
1. 定义Runnable接口的实现类，并重写该接口的run()方法，该run()方法的方法体同样是该线程的线
        程执行体。
        2. 创建Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象，该Thread对象
        才是真正的线程对象。
        3. 调用线程对象的start()方法来启动线程。*/
public class Test1 {
    public static void main(String[] args) {
        //创建runnable实现类的对象
        Runnable rs = new SubRunnable();
                            //把runnable实现类对象作为thread对象参数
        Thread t1 = new Thread(rs,"自定义线程1");
        Thread t2 = new Thread(rs,"自定义线程2");

        t1.start();
        t2.start();

    }
}
