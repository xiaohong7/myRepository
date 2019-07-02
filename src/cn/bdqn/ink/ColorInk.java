package cn.bdqn.ink;

import cn.bdqn.i.Ink;

import java.awt.*;

public class ColorInk implements Ink {
    @Override
    public String getColor(int red, int green, int blue) {
        Color color=new Color(red,green,blue);
        System.out.println("使用彩色墨盒");
        return "#"+Integer.toHexString(color.getRGB()).substring(2);
    }

}
