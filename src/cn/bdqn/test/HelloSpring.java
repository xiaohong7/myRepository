package cn.bdqn.test;

public class HelloSpring {
    private String who=null;

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }
    public void print(){
        System.out.println("hello,"+this.who);
    }
}
