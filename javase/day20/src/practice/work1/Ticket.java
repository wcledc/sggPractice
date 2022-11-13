package practice.work1;

public class Ticket implements Runnable{
    //声明并初始化票的总张数
    private int ticket = 100;

    @Override
    public void run() {
        while (ticket > 0){
            //开启线程同步
            synchronized (this){
                if (ticket > 0) {
                    //获取当前执行线程对象            获取当前线程名
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "卖出去一张票，剩余" + --ticket + "张票");
                }
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
