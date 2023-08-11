package com.damaha.principle;

import com.damaha.principle.communication.Email;
import com.damaha.principle.communication.WeiXin;

public class Main {
    public static void main(String[] args) {
        Person01 person01 = new Person01();
        person01.receiver(new WeiXin());
        person01.receiver(new Email());
        String s = new String();
    }
}