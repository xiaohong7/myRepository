package cn.bdqn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring helloSpring=(HelloSpring)context.getBean("helloSpring");
        helloSpring.print();

    }
}
