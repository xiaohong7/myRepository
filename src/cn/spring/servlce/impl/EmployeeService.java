package cn.spring.servlce.impl;

public class EmployeeService {

    //被增强的方法
    public int addEmployee(int id,String name){
        System.out.println("添加员工业务");
        return 2;
    }
    public int addEmpoyee(int id,String name,String s){
        return 3;
    }


}
