package practice;

public class Work2 {
    public static void main(String[] args) {
        //父类引用指向子类对象
        Plant p = new Flower();
        //调用属性并赋值
        p.name = "蒲公英的约定";
        p.age = 3;
        p.colour = "黄色";
        //调用子类特有属性 向下转型
        Flower f = (Flower)p;
        f.breed = "蒲公英";
        System.out.println(p.toString());
        //方法调用
        p.grow();
        //调用子类特有方法
        f.fade();

    }
}
//创建父类 植物类
class Plant{
    // 定义属性 名字 年龄 颜色
    String name;
    int age;
    String colour;
    //定义方法
    public void grow(){
        System.out.println("植物在生长");
    }
}
//创建子类 花类
class Flower extends Plant{
    //定义属性
    String breed;
    //定义方法
    public void fade(){
        System.out.println("花儿在凋谢");
    }
    //子类重写父类方法
    public void grow(){
        System.out.println("花儿在绽放");
    }
    //子类重写to String方法 用于输出属性值
    @Override
    public String toString() {
        return "Flower{" +
                "品种='" + breed + '\'' +
                ", 姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 颜色='" + colour + '\'' +
                '}';
    }
}
