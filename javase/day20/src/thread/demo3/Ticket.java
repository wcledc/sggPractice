package thread.demo3;
/*synchronized关键字
        *      含义:
        *          同步的
        *      修饰:
        *          代码块,成员方法
        *      作用:
        *          被synchronized关键字修饰的内容,只能被一条线程所执行,其它线程如果想执行,需要在外面进行等待,等待synchronized关键字
        *          修饰的内容被线程执行完毕,等待的线程对象再进行资源的抢夺,谁抢夺到执行执行synchronized关键字修饰的内容
        *
        * 同步代码块:
        *      含义:
        *          被synchronized关键字修饰的代码块
        *      格式:
        *          synchronized (同步对象) {
        *              可能出现线程安全的代码
        *          }
        *      特点:
        *          多条线程对象遇到了同步代码块,多条线程会抢夺同步代码块的"同步对象",同步对象只能被一条线程抢夺到,谁抢夺到就可以执行
        *          同步代码块中的内容,其它线程对象在同步代码块的外面进行等待,等待在同步代码块中的线程对象执行完毕归还同步对象,其它线程
        *          继续进行抢夺,从而可以保证线程不会出现安全问题
        *
        * 同步对象:
        *      前提:
        *         多条线程对象抢夺到的同步对象必须相同,如果不是同一对象,无法解决线程安全问题
        *      对象的本质:
        *          如果多条线程处理同一资源,且多条线程的执行动作相同,此时同步对象就是执行动作对象(this)
        *          如果多条线程处理同一资源,且多条线程的执行动作不同,此时同步对象就是同一资源对象
        *          如果多条线程处理同一资源,且处理线程安全时涉及静态方法,此时同步对象就是静态所属类的字节码文件对象*/
public class Ticket implements Runnable {
    //声明并初始化总票数
    private int ticket = 100;

    //重写接口中的抽象方法
    @Override
    public void run() {

        while (ticket > 0) {
            //线程同步   //同步对象
            synchronized (this) {
                if (ticket > 0) {
                    //获取当前执行线程的名字
                    String name = Thread.currentThread().getName();

                    //目前ticket=1   //线程1 线程2 线程3
                    System.out.println(name + "卖了一张票，目前剩余" + --ticket + "张票");
                }
            }
            //sleep延迟执行
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}