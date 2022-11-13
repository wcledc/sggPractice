package practice.work1;

public class Test1 {
    public static void main(String[] args) {
        //创建实现类对象
        Ticket ticket = new Ticket();

        //创建线程对象
        Thread t1 = new Thread(ticket,"窗口1");
        Thread t2 = new Thread(ticket,"窗口2");
        Thread t3 = new Thread(ticket,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
