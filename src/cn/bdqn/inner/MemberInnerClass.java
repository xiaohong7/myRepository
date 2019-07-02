package cn.bdqn.inner;
/*
间接地去实现多继承
成员内部类特点：
$:为内部类准备的
Inner classes cannot have static declarations
//成员内部类可以直接调用外部类的方法，属性
            //外部类不能直接访问内部类的方法成员
       静态常量可以在内部类中使用
静态内部类
匿名内部类

 */
public class MemberInnerClass {
    public static void main(String[] args) {
        Outer1 outer1=new Outer1();
        outer1.show();
        Outer1.Inner1 inner1=outer1.new Inner1();
        inner1.show();
    }

}

class Outer1{
    private int id=1;
    private String name="张三";
    public void show(){
        System.out.println(id+"\t\t"+name);


    }
    public class Inner1{
        private int id=2;
        private String name2="里斯";

        public void show(){
            System.out.println(Outer1.this.id+"\t"+this.name2);
            Outer1.this.show();//成员内部类可以直接调用外部类的方法，属性
            //外部类不能直接访问内部类的方法成员
        }
    }
}
