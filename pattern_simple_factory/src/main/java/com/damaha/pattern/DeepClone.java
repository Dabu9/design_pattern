package com.damaha.pattern;

import org.junit.jupiter.api.Test;

import java.io.*;

public class DeepClone {
    /**
     * 测试深克隆
     * 通过观察克隆前后，引用类型的成员变量的地址
     * 如果是浅克隆，只是复制一个地址，即克隆前后，引用类型的成员变量地址一致
     * 如果是深克隆，将复制(新建)一个引用类型的成员变量，二者的地址不相同。
     */
    @Test
    public void testDeepClone(){
        Bearing b1 = new Bearing("瓦轴");
        MotorDeep m1 = new MotorDeep("本田","汽油",18);
        m1.setBearing(b1);
        MotorDeep m2 = null;
        try {
            m2 = m1.deepClone();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
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

class MotorDeep implements Serializable {
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

    public MotorDeep() {
    }

    public MotorDeep(String brand, String type, Integer age) {
        this.brand = brand;
        this.type = type;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MotorDeep{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", bearing=" + bearing +
                '}';
    }

    public MotorDeep deepClone() throws IOException,ClassNotFoundException, OptionalDataException {
        // 将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        // 将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (MotorDeep) ois.readObject();
    }
}
