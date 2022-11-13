package thread.demo5;

//生产者线程
public class BaoZiPu implements Runnable{
    //创建包子属性
    private BaoZi bz;

    //定义有参构造
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }
    //重写run方法
    @Override
    public void run() {
        while (true){
            synchronized (bz){
                //判断包子状态
                if (bz.getFlag()){  //为ture说明有包子
                    try {
                        bz.wait();    //有包子 包子铺进行无限等待
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else { //else说明没有包子  开始做包子
                    //获取当前执行线程名字
                    String name = Thread.currentThread().getName();
                    //没有包子开始做包子
                    System.out.println(name + "：做包子咯，包子出锅喽");

                    //通过代码干预做包子速度 （降低打印时间） 延迟执行
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    //包子做好 开始修改资源    为true 有包子了
                    bz.setFlag(true);

                    //唤醒学生线程购买包子
                    bz.notify();
                }
            }
        }
    }
}
