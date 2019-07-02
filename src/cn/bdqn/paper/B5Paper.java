package cn.bdqn.paper;

import cn.bdqn.i.Paper;

public class B5Paper implements Paper {
    @Override
    public void printInChar(char c) {
        System.out.println(c);
    }

    @Override
    public String getContent() {
        return "B5纸张";
    }
}
