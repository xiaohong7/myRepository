package cn.spring.test;

import cn.spring.servlce.impl.EmployeeService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployeeLogger {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService=(EmployeeService) context.getBean("employeeService");
        employeeService.addEmployee(1,"张海");

    }
}
