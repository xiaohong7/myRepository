package cn.bdqn.print;

import cn.bdqn.i.Ink;
import cn.bdqn.i.Paper;
import cn.bdqn.paper.A4Paper;

public class Printer {
    private Ink ink=null;
    private Paper paper=null;

    Paper paper2=new A4Paper();

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void print(String str){
        System.out.println("使用"+ink.getColor(255,200,0)+"颜色打印:\n"+paper2.getContent());
        for(int i=0;i<str.length();i++){
            paper.printInChar(str.charAt(i));
        }
        System.out.println(paper.getContent());
    }
}
