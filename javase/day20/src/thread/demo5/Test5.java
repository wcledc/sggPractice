package thread.demo5;
/*
线程间通信(等待唤醒机制):
        *      含义:
        *          让多条线程进行"通信"操作,从而建立联系,保障线程对象可以有规则的执行
        *      角色:
        *          生产者线程:负责生产资源的线程
        *          消费者线程:负责消费资源的线程
        *      涉及方法(Object类):
        *          public final void wait()
        *              在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
        *          public final void notify()
        *              唤醒在此对象监视器上等待的单个线程。
        *          public final void notifyAll()
        *              唤醒在此对象监视器上等待的所有线程。
*/
public class Test5 {
    public static void main(String[] args) {
        //创建包子资源对象
        BaoZi bz = new BaoZi();

        //创建实现类（包子铺，学生）线程对象

       //包子铺线程
        BaoZiPu baoZiPu = new BaoZiPu(bz);
        Thread bzp = new Thread(baoZiPu,"包子铺");

        //学生线程
        Student stu = new Student(bz);
        Thread s1 = new Thread(stu,"学生1");
        Thread s2 = new Thread(stu,"学生2");
        Thread s3 = new Thread(stu,"学生3");

        //开启线程
        bzp.start();
        s1.start();
        s2.start();
        s3.start();

    }
}
