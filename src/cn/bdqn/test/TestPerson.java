package cn.bdqn.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

    @Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person=(Person) context.getBean("people1");
        person.say();

    }
    @Test
    public void test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person=(Person) context.getBean("people2");

        person.say();

    }
}
