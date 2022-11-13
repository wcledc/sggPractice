package com.atguigu;

public class Demo4 {
    public static void main(String[] args) {
       /* //通过无参构造创建子类对象
        Tiger t1 = new Tiger();
        //调用属性并赋值
        t1.age = 18;
        t1.gender = "雄性";
        t1.colour = "黄色";
        System.out.println("年龄: " + t1.age + ",性别: " + t1.gender + ",颜色: " + t1.colour);
        //调用方法
        t1.eat();
        t1.sleep();
        t1.prey();*/

        //通过有参构造创建子类对象
        Tiger t2 = new Tiger(19,"雌性","黑色");
       // System.out.println("年龄: " + t2.age + ",性别: " + t2.gender + ",颜色: " + t2.colour);
        System.out.println(t2.toString());
        t2.eat();
        t2.sleep();
        t2.prey();

    }
}
//创建一个父类 动物类
class Animal{
    //定义属性 年龄 性别
    int age;
    String gender;
    //定义无参构造
    public Animal(){
        System.out.println("父类无参构造");
    }
    //定义有参构造
    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    //定义方法
    public void eat(){
        System.out.println("吃东西");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}

//创建子类
class Tiger extends Animal{
    //定义子类属性
    String colour;

    //子类无参构造
    public Tiger(){
        System.out.println("***子类无参构造***");
    }
    //子类有参构造
    public Tiger(int age, String gender, String colour) {
        super(age, gender);
        this.colour = colour;
    }

    //子类重写覆盖父类的方法，因为父类方法无法满足子类需求
    @Override
    public void eat(){
        System.out.println("老虎在吃水牛");
    }
    //定义子类方法
    public void prey(){
        System.out.println("老虎在捕食");
    }
    //子类重写to String 方法 用于显示属性值
    @Override
    public String toString() {
        return "Tiger{" +
                "颜色='" + colour + '\'' +
                ", 年龄=" + age +
                ", 性别='" + gender + '\'' +
                '}';
    }
}


