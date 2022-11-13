package practice;

public class Work1 {
    public static void main(String[] args) {
        //Tiger.colour = "黄色";   静态属性随着类的加载而加载 优先于对象而存在 so创建对象之前就已存在
        //Tiger.sleep();     静态方法随着类的加载而加载 优先于对象而存在 so创建对象之前就已存在
        //创建对象
        Tiger t = new Tiger();

        //调用静态属性并赋值  静态属性所属于类 可以直接使用类名调用 静态属性被所有对象所共享
        Tiger.colour = "黄色";
        //System.out.println("老虎颜色：" + Tiger.colour);

        //调用非静态属性并赋值  ----所属于对象
        t.age = 18;
        t.gender = "雄性";
        System.out.println("年龄：" + t.age + ",性别：" + t.gender + "老虎颜色：" + Tiger.colour);

        //调用非静态方法 ----所属于对象
        t.eat();

        //调用静态方法  所属于类 可以直接使用类名调用
        Tiger.sleep();

        //创建对象2
        Tiger t2 = new Tiger();
        //调用静态属性并赋值--- 所属于类
        Tiger.colour = "白色";
        //System.out.println("老虎颜色：" + Tiger.colour);
        //调用非静态属性并赋值 --- 所属于对象
        t2.age = 16;
        t2.gender = "雌性";
        System.out.println("年龄：" + t2.age + ",性别：" + t2.gender + "老虎颜色：" + Tiger.colour);
        //调用非静态方法 --- 所属于对象
        t2.eat();
        //调用静态方法 --- 所属于类
        Tiger.sleep();
    }
}

//创建一个类 老虎类
class Tiger{
    //定义属性 成员变量 实例变量 非静态变量---所属于对象
    int age;
    String gender;
    //静态变量 由static修饰 -----所属于类 随着类的加载而加载
    static String colour;

    //定义行为（成员方法）---- 所属于对象
    public void eat(){
        System.out.println("老虎在吃肉");
    }
    //定义静态方法 由static修饰 ----所属于类
    public static void sleep(){
        System.out.println("老虎在睡觉");
    }
}

