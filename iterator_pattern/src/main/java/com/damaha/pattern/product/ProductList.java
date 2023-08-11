package com.damaha.pattern.product;

import com.damaha.pattern.iterator.AbstractIterator;
import com.damaha.pattern.iterator.ProductIterator;

import java.util.List;

/**
 * 具体的产品聚合类
 */
public class ProductList extends AbstractObjectList{
    public ProductList(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbstractIterator creatIterator() {
        return new ProductIterator(this);
    }
}
