package practice;

public class work2 {
    public static void main(String[] args) {
        //调用无参构造创建对象
        //Dog d = new Dog();
        //调用有参构造创建对象
        Dog d1 = new Dog(3,"lucky","白色");
        d1.eat();
        d1.bark();
        System.out.println();
    }
}
//定义一个狗类
class Dog{
    //成员变量（属性）
    private int age;
    private String name;
    private String colour;
    //创建构造器（无参构造）
    public Dog(){}
    //有参构造     参数列表
    public Dog(int age,String name,String colour){
       this.age = age;
        this.name = "name";
        this.colour = "colour";
    }
    //方法 功能
    public void eat(){
        System.out.println("狗在吃奥里给");
    }
    public void bark(){
        System.out.println("狗在叫");
    }
}
