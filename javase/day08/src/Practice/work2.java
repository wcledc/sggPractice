package Practice;

public class work2 {
    public static void main(String[] args) {
        //通过无参构造创建花子类对象
        Flower f1 = new Flower();
        //调用属性并赋值
        f1.setBreed("蒲公英");
        f1.setName("蒲公英的秘密");
        f1.setAge(3);
        f1.setColour("白色");
        //调用方法
        //f1.show();
        System.out.println(f1.toString()); //调用to String方法打印输出属性值
        f1.grow();
        f1.fade();


        //通过有参构造创建树子类对象
        Tree t1 = new Tree("珊瑚海",7,"绿色",77);
        //调用方法
        //t1.show();
        System.out.println(t1.toString());
        t1.grow();
        t1.old();
    }
}
//创建一个父类 植物类
class Botany{
    // 定义属性 （成员变量） 并进行封装
    private String name;
    private int age;
    private String colour;

    //定义无参构造
    public Botany(){
        System.out.println("***父类无参构造***");
    }
    //定义有参构造
    public Botany(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    //提供供外界访问的get（获取） set（设置）方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //定义方法 (成员方法）
    public void grow(){
        System.out.println("植物在生长");
    }
}

//创建子类 花类 继承父类植物类
class Flower extends Botany{
    //定义子类属性（成员变量） 品种
    private String breed;

    //定义子类无参构造
    public Flower(){
        System.out.println("***子类花类无参构造***");
    }
    //定义子类有参构造
    public Flower(String name, int age, String colour, String breed) {
        super(name, age, colour);  //super: 父类对象引用
        this.breed = breed;        //this: 当前类对象的引用
    }

    //提供供外界访问的get（获取值） set（设置值）的方法
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //子类重写父类的方法 因为父类方法无法满足子类需求 (方法重写)
    @Override
    public void grow(){
        System.out.println("花朵在绽放");
    }
    //定义子类方法
    public void fade(){
        System.out.println("花朵在凋谢");
    }
    //定义show 方法  输出属性值
   /* public void show(){
        System.out.println("品种: " + getBreed() + ",姓名: " + getName() + ",年龄: " + getAge() + ",颜色: " + getColour());
    }*/
    //子类重写to String方法 用于输出属性值
    @Override
    public String toString() {
        return "Flower{" +
                "品种='" + breed + '\'' +
                ", 姓名='" + getName() + '\'' +
                ", 年龄=" + getAge() +
                ", 颜色='" + getColour() + '\'' +
                '}';
    }
}

//创建子类 树类 继承父类植物类
class Tree extends Botany{
    //定义子类属性 高度(成员变量） 并进行封装
    private int height;

    //子类无参构造
    public Tree(){
        System.out.println("***子类树类无参构造***");
    }
    //子类有参构造
    public Tree(String name, int age, String colour, int height) {
        super(name, age, colour);  //父类对象引用
        this.height = height;      //当前类对象引用
    }

    //提供供外界的get（获取值） set（设置值）的方法
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //子类重写父类的方法 因为父类方法无法满足子类需求 （方法重写）
    @Override
    public void grow(){
        System.out.println("大树在结果");
    }
    //定义子类方法
    public void old(){
        System.out.println("大树在老去");
    }
    //定义show 方法 用于输出属性值
    public void show(){
        System.out.println("姓名: " + getName() + ",年龄: " + getAge() + ",颜色: " + getColour() + ",高度: " + getHeight());
    }
    //子类重写父类to String 方法 用于输出属性值

    @Override
    public String toString() {
        return "Tree{" +
                "高度=" + height +
                ", 姓名='" + getName() + '\'' +
                ", 年龄=" + getAge() +
                ", 颜色='" + getColour() + '\'' +
                '}';
    }
}
