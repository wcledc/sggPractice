package reflect.demo2;

public class Student {
    //属性
    private String name;
    private int age;

    //无参构造
    public Student(){}

    //有参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
