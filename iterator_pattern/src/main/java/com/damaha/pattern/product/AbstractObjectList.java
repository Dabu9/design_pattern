package com.damaha.pattern.product;

import com.damaha.pattern.iterator.AbstractIterator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObjectList {
    private List<Object> objects = new ArrayList<>();

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }
    public void addObject(Object object){
        this.objects.add(object);
    }
    public void removeObject(Object object){
        this.objects.remove(object);
    }
    public List getObject(){
        return this.objects;
    }

    public abstract AbstractIterator creatIterator();

}
