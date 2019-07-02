package cn.spring.aop;

import org.aspectj.lang.JoinPoint;

public class EmployeeLoggerService {

    public void before(JoinPoint jp){
        System.out.println("前置增强执行了");
        System.out.println(jp.toString());
        System.out.println(jp.getSignature());
        System.out.println("jp.getArgs():"+jp.getArgs());
        System.out.println("jp.getTarget():"+jp.getTarget());

    }
    public void afterReturnning(JoinPoint jp,Object result){
        System.out.println("后置增强执行了");
        System.out.println(jp);
        System.out.println("result:"+result);
        System.out.println(jp.getSignature());//获取签名  方法的信息

    }

    public void before2(){
        System.out.println("22344");
    }
}
