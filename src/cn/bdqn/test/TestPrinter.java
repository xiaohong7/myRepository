package cn.bdqn.test;

import cn.bdqn.print.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrinter {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Printer printer=(Printer)context.getBean("printer");
        String content="从你的全世界路过，把全新的我都活过，Spring 控制反转  面向切面编程,  Spring是轻量级的框架";
        printer.print(content);

    }
}
