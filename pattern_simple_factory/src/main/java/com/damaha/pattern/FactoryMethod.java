package com.damaha.pattern;

import org.junit.jupiter.api.Test;

public class FactoryMethod {
    @Test
    public void TestFactoryMethod(){
        // 创建圆形
        Geometry circular = new CircularFactory().getInstance();
        circular.drew();
        circular.erase();

        // 创建长方形
        Geometry rectangle = new RectangleFactory().getInstance();
        rectangle.drew();
        rectangle.erase();

        // 创建正方形
        Geometry square = new SquareFactory().getInstance();
        square.drew();
        square.erase();

        // 新增三角形
        Geometry triangle = new TriangleFactory().getInstance();
        triangle.drew();
        triangle.erase();
    }
}

/**
 * 抽象工厂类
 */

interface GeometryFactory01 {
    public Geometry getInstance();
}

/**
 * 具体工厂类
 */
class CircularFactory implements GeometryFactory01{
    public Geometry getInstance() {
        return new Circular();
    }
}
class RectangleFactory implements GeometryFactory01{
    public Geometry getInstance() {
        return new Rectangle();
    }
}
class SquareFactory implements GeometryFactory01{
    public Geometry getInstance() {
        return new Square();
    }
}

/**
 * 如果需要添加一个产品，只需要添加一个具体的工厂类及对应产品类即可
 * 不会破坏原有的程序
 */

class TriangleFactory implements GeometryFactory01{
    public Geometry getInstance() {
        return new Triangle();
    }
}

class Triangle extends Geometry{
    @Override
    public void drew() {
        System.out.println("画三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除三角形");
    }
}
