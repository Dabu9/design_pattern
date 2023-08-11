package com.damaha.pattern;

import com.damaha.pattern.iterator.AbstractIterator;
import com.damaha.pattern.product.AbstractObjectList;
import com.damaha.pattern.product.ProductList;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List list = Arrays.asList("张三","李四","王五",222,"利好","网","是");
        AbstractObjectList objs = new ProductList(list);
        AbstractIterator iterator = objs.creatIterator();
        System.out.println("----------------------------------");
        System.out.println("顺序遍历");
        while (!iterator.isLast()){
            System.out.println(iterator.getNextItem());
        }
        System.out.println("----------------------------------");
        System.out.println("逆序遍历");
        while (!iterator.isFirst()){
            System.out.println(iterator.getPreviousItem());
        }
    }
}