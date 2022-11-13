package com.atguigu;
/*需求:使用Java语言模拟以下场景
        学校附近来了一个马戏团(Circus),热闹非凡,刚才给附近的居民发了表演节目单,
        节目单有两个表演的节目:
        1.表演(老虎钻火圈)
        提示:真正表演的是老虎,老虎作为参数,调用老虎自己表演的功能
        2.表演(小熊骑单车)
        提示:真正表演的是小熊,小熊作为参数,调用小熊自己表演的功能*/

public class Demo1 {
    public static void main(String[] args) {
        //创建父类对象  马戏团 看节目
        Circus c = new Circus();
        //多态 父类对象指向子类引用
        CircusAnimal ca = new Bear();
        ca.perfrom();
        CircusAnimal ca1 = new Tiger();
        ca1.perfrom();

    }
}
//定义父类 马戏团
class Circus{
    //方法 1.表演(老虎钻火圈)
    //2.表演(小熊骑单车)
    //多态
    public void perfrom(CircusAnimal ca){
        ca.perfrom();
    }
   /* public void perfrom(Tiger t){
        t.perfrom();
    };
    public void perfrom(Bear b){
        b.perfrom();
    }*/
}
//定义父类  所有马戏团的动物
class CircusAnimal{
    //定义方法
    public void perfrom(){
        System.out.println("马戏团动物 都会表演节目");
    }
}
//定义子类 老虎类
class Tiger extends  CircusAnimal{
    //子类重写父类的方法
    public void perfrom(){
        System.out.println("老虎在钻火圈");
    }
}
//定义子类 小熊类
class Bear extends CircusAnimal{
    //子类重写父类方法
    public void perfrom(){
        System.out.println("小熊在骑单车");
    }
}

