package com.damaha.pattern;

import org.junit.jupiter.api.Test;

public class TestString {
    @Test
    public void TestStringFly(){
        String s1 = "abcde";
        String s2 = "abcde";
        String s3 = "ab"+"cde";
        String s4 = "ab";
        s4 += "cde";
        System.out.println("s1 == s2: "+ (s1 == s2));
        System.out.println("s2 == s3: "+ (s2 == s3));
        System.out.println("s3 == s4: "+ (s3 == s4));
        /**
         * s3和s4不相等的原因在于，s4在创建时另外开辟了地址空间，即便后续通过+=使得其值与s3相等，也无法改变地址。
         */

        System.out.println("s1: "+s1.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(s1)));
        System.out.println("s2: "+s1.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(s2)));
        System.out.println("s3: "+s1.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(s3)));
        System.out.println("s4: "+s1.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(s4)));

        /**
         * 虽然通过享元模式，s1和s2指向了同一个地址
         * 但当s2的值发生改变时，s2将会去开辟一个新的地址空间对值进行修改
         * 该机制也被称为Copy On Write
         * 在修改享元对象时，先将原有对象复制一份，然后在新对象上再实施修改操作的机制
         */
        s2+="e";
        System.out.println("s1 == s2: "+ (s1 == s2));
        System.out.println("s1: "+s1.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(s1)));
        System.out.println("s2: "+s1.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(s2)));



        System.out.println("采用equals比较");
        // 注意equals只是类型比较
        System.out.println(s1.equals(s4));
    }
}
