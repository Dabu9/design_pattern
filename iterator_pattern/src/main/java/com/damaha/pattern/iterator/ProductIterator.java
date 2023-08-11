package com.damaha.pattern.iterator;

import com.damaha.pattern.product.ProductList;

import java.util.ArrayList;
import java.util.List;

public class ProductIterator extends AbstractIterator{
    private ProductList productList;
    private List products = new ArrayList<>();

    private Integer cursor1;  // 定义一个正向遍历的游标
    private Integer cursor2;  // 定义一个逆向遍历的游标

    public ProductIterator(ProductList productList) {
        this.productList = productList;
        this.products = productList.getObject();
        this.cursor1 = 0;
        this.cursor2 = products.size() - 1;
    }
    // 操作游标
    @Override
    public void next() {
        if (cursor1 < products.size()){
            cursor1 ++;
        }
    }

    @Override
    public boolean isLast() {
        return (cursor1== products.size());
    }

    @Override
    public void previous() {
        if (cursor2 > -1){
            cursor2 --;
        }
    }

    @Override
    public boolean isFirst() {
        return (cursor2==-1);
    }

    @Override
    public Object getNextItem() {
        Object o = products.get(cursor1);
        next();
        return o;
    }

    @Override
    public Object getPreviousItem() {
        Object p = products.get(cursor2);
        previous();
        return p;
    }
}
