package com.damaha.pattern.decorator;

import com.damaha.pattern.member.Component;

/**
 * 抽象装饰器
 */
public class ComponentDecorator extends Component {
    // 声明一个component对象
    private Component component;

    /**
     * 有参构造方法
     * @param component
     */
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    /**
     * 重写基类的display方法
     */
    @Override
    public void display() {
        component.display();
    }
}
