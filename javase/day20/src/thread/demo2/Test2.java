package thread.demo2;

public class Test2 {
    public static void main(String[] args) {
        //创建实现类对象
        Ticket ticket = new Ticket();
        //把实现类对象作为参数传递给线程对象
        Thread t1 = new Thread(ticket,"线程1");
        Thread t2 = new Thread(ticket,"线程2");
        Thread t3 = new Thread(ticket,"线程3");

        t1.start();
        t2.start();
        t3.start();
    }
}
