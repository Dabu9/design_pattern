package com.damaha.pattern.decorator;

import com.damaha.pattern.member.Component;

public class ScrollBarDecorator extends ComponentDecorator{


    /**
     * 有参构造方法
     *
     * @param component
     */
    public ScrollBarDecorator(Component component) {
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
        System.out.println("执行添加ScrollBar方法");
    }
}
