package com.damaha.pattern.member;

public abstract class IgoChessman {
    public abstract String getColor();
    public void display(Coordinate coord){
        System.out.println("棋子的颜色为："+this.getColor());
        System.out.println("棋子的位置为：x="+coord.getX()+",y="+coord.getY());
    }
}
