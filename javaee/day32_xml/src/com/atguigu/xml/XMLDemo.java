package com.atguigu.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class XMLDemo {
    public static void main(String[] args) throws Exception {
        //1.获取XML解析器对象
        SAXReader sr = new SAXReader();

        //2.通过解析器对象读取指定的xml文件对象
        Document doc = sr.read(ClassLoader.getSystemResourceAsStream("student.xml"));

        //3.通过文档对象获取跟标签对象
        Element rootElement = doc.getRootElement();

        //4.根据跟标签对象获取所有子标签
        List<Element> list = rootElement.elements();

        //5.遍历所有子标签集合
        for (Element student : list) {
            Element id = student.element("id");
            Element name = student.element("name");
            Element age = student.element("age");

            System.out.println(id.getText() + name.getText() + age.getText());
        }

    }
}
