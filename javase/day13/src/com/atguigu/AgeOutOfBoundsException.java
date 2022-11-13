package com.atguigu;
/*

    自定义异常的步骤

        1.定义一个见名知意的异常类

        2.与异常类建立继承关系
            继承java.lang.Exception,为编译时异常
            继承java.lang.RuntimeException为运行时异常

        3.定义构造器
            空参+有参(String Message)

        注意:
            自定义的异常只能通过throw抛出
     */
          //与异常类建立继承关系                  （编译时异常）   继承java.lang.RuntimeException为运行时异常
public class AgeOutOfBoundsException extends Exception{
    public static void main(String[] args) {

    }
    //定义构造器
    //空参构造
    public AgeOutOfBoundsException(){}
    //有参构造(String Message)
    public AgeOutOfBoundsException(String message) {
        super(message);
    }


}
