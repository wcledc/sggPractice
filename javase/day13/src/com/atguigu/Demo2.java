package com.atguigu;
/*
    异常
        程序在运行时,遇到的非正常的现象

        异常分类
            Error  严重 硬件  程序员处理不了

            Exception
                可能代码逻辑引发的问题
         如何处理异常
         1> 自己不处理 把异常抛给调用者去处理
            格式  方法的声明后 + throws + 异常类型(如 Exception )
                引发的 编译期异常
                作用:旨在提醒该方法的调用者 该方法可能会有异常产生,要求调用者必须处理
                throws
                    标记
                    位置:方法的声明上  +  异常类型

                throw
                    动作
                    位置:方法内部  + 异常对象

            谁来决定该方法抛的异常是  编译期异常还是运行时异常
                如果方法上声明了throws ,
                那么后面的异常类型除了RuntimeExcetion表示运行时异常外,其它都是编译期异常

                如果throws的异常是Exception 那么默认是  编译期异常
                如果throw 抛的是Exception 那么 该方法必须要有throws + Exception
                如果throw 抛的是RuntimeExcetion  那么 该方法可以不写throws

         2> 自己处理 try...catch

     */
import com.atguigu.bean.Person;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        Person p = new Person("迪迦",233);
        System.out.println(p.toString());
    }
}
