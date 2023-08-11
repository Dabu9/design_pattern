package com.damaha.pattern;

import com.damaha.pattern.decorator.BlackBorderDecorator;
import com.damaha.pattern.decorator.ScrollBarDecorator;
import com.damaha.pattern.member.Component;
import com.damaha.pattern.member.ListBox;
import com.damaha.pattern.member.TextBox;
import com.damaha.pattern.member.Window;

public class Main {
    public static void main(String[] args) {
        /**
         * 通过装饰器，能够看到构件c1前后调用display方法的结果已经发生改变，也就是为c1添加了新的功能
         */
        // 创建了一个被装饰的构件
        Component c1 = new Window();
        c1.display();
        System.out.println("------------------");
        // 对c1进行装饰
        c1 = new BlackBorderDecorator(c1);
        c1.display();

        System.out.println("------------------");

        Component c2 = new ListBox();
        c2.display();
        System.out.println("-------对c2进行第一次装饰-----------");
        //对c2进行第一次装饰
        c2 = new ScrollBarDecorator(c2);
        c2.display();
        //对c2进行第二次装饰
        System.out.println("-------对c2进行第二次装饰-----------");
        c2 = new BlackBorderDecorator(c2);
        c2.display();
        System.out.println("-----------------------------------");

        /**
         * 半透明装饰模式
         */
        Component c3 = new TextBox();
        c3.display();
        System.out.println("-------对c3进行第一次装饰-----------");
        BlackBorderDecorator c3d = new BlackBorderDecorator(c3);
        c3d.display();
        c3d.addMethod();

        System.out.println("-------对c3进行第二次装饰-----------");
        ScrollBarDecorator c3dd = new ScrollBarDecorator(c3d);
        c3dd.display();
    }
}