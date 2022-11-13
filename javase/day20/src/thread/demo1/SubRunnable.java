package thread.demo1;

//创建子类实现Runnable接口
public class SubRunnable implements Runnable{

//重写run方法
    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
                                //获取当前正在执行线程的对象
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
