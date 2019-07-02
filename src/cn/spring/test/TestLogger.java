package cn.spring.test;

import cn.spring.entity.User;
import cn.spring.servlce.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLogger {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService  userService=(UserService)context.getBean("service");
        User user=new User();
        user.setId(3);
        user.setUserName("zll");
        user.setUserPassword("0000000");
        user.setEmail("22888999@qq.com");
        userService.addUser(user);
    }
}
