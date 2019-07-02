package cn.bdqn.ink;

import cn.bdqn.i.Ink;

import java.awt.*;

public class GreyInk implements Ink {
    @Override
    public String getColor(int red, int green, int blue) {
        int c=(red+green+blue)/3;
        Color color=new Color(c,c,c);
        System.out.println("使用灰色墨盒");
        return "#"+Integer.toHexString(color.getRGB()).substring(2);
    }
}
