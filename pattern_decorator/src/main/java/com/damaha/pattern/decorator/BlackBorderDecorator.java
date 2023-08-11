package com.damaha.pattern.decorator;

import com.damaha.pattern.member.Component;

public class BlackBorderDecorator extends ComponentDecorator{


    /**
     * 有参构造方法
     *
     * @param component
     */
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    /**
     * 重写父类的display方法
     */
    @Override
    public void display() {
        // 调用添加的方法
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar(){
        System.out.println("执行添加BlackBorder方法");
    }

    public void addMethod(){
        System.out.println("半透明模式才能直接调用的");
    }
}
