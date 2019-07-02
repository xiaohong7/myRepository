package cn.bdqn.paper;

import cn.bdqn.i.Paper;

public class A4Paper implements Paper {
    @Override
    public void printInChar(char c) {
        System.out.println(c);
    }

    @Override
    public String getContent() {
        return "A4纸张";
    }
}
