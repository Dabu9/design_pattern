package com.damaha.pattern;

import org.junit.jupiter.api.Test;

import java.io.Serializable;

public class Prototype {
    @Test
    public void testPrototype(){
        Bearing b1 = new Bearing("瓦轴");
        Motor m1 = new Motor("本田","汽油",18);
        m1.setBearing(b1);
        Motor m2 = m1.clone();
        System.out.println("clone后的m1与m2是否相同:"+(m1.equals(m2)));
        System.out.println("m1:"+m1);
        System.out.println("m2:"+m2);
        m2.setBrand("宝马");
        m2.setAge(3);
        System.out.println("修改后的m2:"+m2);
        System.out.println("getClass返回值是否相同:"+(m1.getClass()==m2.getClass()));
        System.out.println("m1的class:"+m1.getClass().getName());
        System.out.println("m2的class:"+m2.getClass().getName());
    }
}

class Motor implements Cloneable{
    private String brand;
    private String type;
    private Integer age;
    private Bearing bearing;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Bearing getBearing() {
        return bearing;
    }

    public void setBearing(Bearing bearing) {
        this.bearing = bearing;
    }

    public Motor() {
    }

    public Motor(String brand, String type, Integer age) {
        this.brand = brand;
        this.type = type;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", bearing=" + bearing +
                '}';
    }

    public Motor clone(){
        Object obj = null;
        try {
            obj = super.clone();
        }
        catch (CloneNotSupportedException exception){
            System.out.println("CloneNotSupportedException");
        }

        return (Motor)obj;
    }
}

class Bearing implements Serializable {
    String brand;

    public Bearing() {
    }

    public Bearing(String brand) {

        this.brand = brand;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}