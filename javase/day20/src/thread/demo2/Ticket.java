package thread.demo2;
/*表示卖票的动作*/
/*线程安全问题:
        *      前提条件:
        *          必须是多条线程处理同一数据资源时,才可能出现线程安全问题
        *      安全问题:
        *          出现重复数据
        *          出现非法数据
        *      解决方案:
        *          同步
        *          Lock锁(暂不涉及)*/

//实现Runnable接口
public class Ticket implements Runnable{
    //声明并初始化总票数
    private int ticket = 100;

//重写接口中的抽象方法
    @Override
    public void run() {

        while (ticket > 0){

            //sleep延迟执行
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //获取当前执行线程的名字
            String name = Thread.currentThread().getName();



            //目前ticket=1   //线程1 线程2 线程3
            System.out.println(name + "卖了一张票，目前剩余" + --ticket +"张票");
        }
    }
}
