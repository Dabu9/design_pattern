package com.damaha.pattern;

import org.junit.jupiter.api.Test;

public class SimpleFactory {
    @Test
    public void TestSimpleFactory() throws UnsupportedShapeException{
        // 创建圆形
        Geometry circular = GeometryFactory.getInstance("circular");
        circular.drew();
        circular.erase();

        // 创建长方形
        Geometry rectangle = GeometryFactory.getInstance("rectangle");
        rectangle.drew();
        rectangle.erase();

        // 创建正方形
        Geometry square = GeometryFactory.getInstance("square");
        square.drew();
        square.erase();

        // 抛出异常
//        Geometry xx = GeometryFactory.getInstance("xx");
    }


}


/**
 * 抽象类
 */
abstract class Geometry {
    public abstract void drew();
    public abstract void erase();
}

class GeometryFactory {
    public static Geometry getInstance(String arg) throws UnsupportedShapeException {
        if (arg!=null) {
            if (arg.equalsIgnoreCase("circular")) {
                return new Circular();
            } else if (arg.equalsIgnoreCase("rectangle")) {
                return new Rectangle();
            } else if (arg.equalsIgnoreCase("square")) {
                return new Square();
            }
            else {
                throw new UnsupportedShapeException("没有此类型的图形");
            }
        }
        return null;
    }
}

class Circular extends Geometry {
    @Override
    public void drew() {
        System.out.println("绘制圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }
}
class Rectangle extends Geometry {
    @Override
    public void drew() {
        System.out.println("绘制长方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除长方形");
    }
}

class Square extends Geometry {
    @Override
    public void drew() {
        System.out.println("绘制正方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除正方形");
    }
}


class UnsupportedShapeException extends Exception {

    public UnsupportedShapeException(String message) {
        super(message);

    }

}

