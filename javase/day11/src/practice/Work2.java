package practice;
/*定义一个女朋友类。女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。
 另外定义一个用于展示三个属性值的show()方法。
 请在测试类中通过有参构造方法创建对象并赋值，然后分别调用展示方法、洗衣服方法和做饭方法。*/
public class Work2 {
    public static void main(String[] args) {
        //使用有参构造创建对象并赋值
        Girlfriend gf = new Girlfriend("刘亦菲",172,120);

        //调用方法
        gf.show();
        gf.wash();
        gf.cook();

    }
}
//定义一个女朋友类
class Girlfriend{
    //定义属性 包含：姓名，身高，体重。并进行封装
    private String name;
    private int height;
    private int weight;

    //无参构造
    public Girlfriend(){
        System.out.println("无参构造");
    }
    //有参构造
    public Girlfriend(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    //提供供外界访问的get（获取） set（设置） 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //定义行为 （成员方法）
    public void wash(){
        System.out.println("女朋友在洗衣服");
    }
    public void cook(){
        System.out.println("女朋友在做饭");
    }
    //定义一个用于展示三个属性值的show()方法。
    public void show(){
        System.out.println("姓名：" + getName() + ",身高：" + getHeight() + ",体重：" + getWeight());
    }
}
