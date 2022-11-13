package thread.demo4;

public class Ticket implements Runnable{
    //声明并初始化总票数
    private int ticket = 100;

    //重写接口中的抽象方法
    @Override
    public void run() {

        while (ticket > 0){
            method();

            //sleep延迟执行
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
    //线程同步方法
    private synchronized void method(){
        if (ticket > 0) {
            //获取当前执行线程的名字
            String name = Thread.currentThread().getName();

            //目前ticket=1   //线程1 线程2 线程3
            System.out.println(name + "卖了一张票，目前剩余" + --ticket + "张票");
        }
    }
}
