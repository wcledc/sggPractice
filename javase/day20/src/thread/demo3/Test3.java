package thread.demo3;

public class Test3 {
    public static void main(String[] args) {
        //创建实现类对象
        Ticket tk = new Ticket();

        //创建线程对象
        Thread t1 = new Thread(tk,"线程1");
        Thread t2 = new Thread(tk,"线程2");
        Thread t3 = new Thread(tk,"线程3");

        //开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}
