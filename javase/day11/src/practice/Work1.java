package practice;
/*定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。

        请定义出手机类，类中要有空参、有参构造方法，set/get方法。

        定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。

        调用对象的两个功能*/
public class Work1 {
    public static void main(String[] args) {
        //6. 在测试类中创建手机对象，使用set方法赋值，分别调用各个方法。
        Phone p = new Phone();
        p.setBrand("小米");
        p.setPrice(3989);
        p.setColor("白色");
        System.out.println(p.toString());
        p.call();
        p.sendMessage();

    }
}
//1. 定义手机类，手机类中定义String类型的品牌，int类型的价格，String类型的颜色，三个成员变量都用privice修饰。
class Phone{
    private String brand;
    private int price;
    private String color;

//2. 提供空参构造方法和有参构造方法。
    public Phone(){
        System.out.println("***无参构造***");
    }

    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
// 3. 提供set/get方法。
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

 //4. 编写打电话的成员方法，方法中对成员变量进行使用。
    public void call(){
        System.out.println("正在使用价格为3998元黑色的小米手机打电话....");
    }
 //5. 编写发短信的成员方法，方法中对成员变量进行使用。
    public void sendMessage(){
        System.out.println("正在使用价格为3998元黑色的小米手机发短信....");
    }

    @Override
    public String toString() {
        return "手机{" +
                "品牌='" + brand + '\'' +
                ", 价格=" + price +
                ", 颜色='" + color + '\'' +
                '}';
    }
}




