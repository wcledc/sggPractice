package thread.demo5;

//创建Student对象 实现Runnable接口
public class Student implements Runnable{

    //创建包子属性
    private BaoZi bz;

    //定义有参构造
    public Student(BaoZi bz) {
        this.bz = bz;
    }
    //重写run方法
    @Override
    public void run() {
        while (true){   //为true 说明有包子
            synchronized (bz){
                //判断包子资源的状态
                if (bz.getFlag()){   //有包子
                    //获取当前执行线程名字
                    String name = Thread.currentThread().getName();
                    System.out.println(name + ": 开始吃包子啦，包子真好吃");
                    //通过人工干预吃包子的时间，延迟线程执行时间
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //包子吃完了 修改资源
                    bz.setFlag(false);
                    //再买一个 唤醒包子铺做包子
                    bz.notifyAll();

                }else {  //说明包子吃完了 开始做包子
                    //学生处于等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
