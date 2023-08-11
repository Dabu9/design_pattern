package com.damaha.pattern;

import com.damaha.pattern.chain.*;
import com.damaha.pattern.request.PurchaseRequest;

public class Main {
    public static void main(String[] args) {
        // 创建执行者 声明类型只能为Approver,否则调用不到setSuccessor方法
        Approver director = new Director("李主任");
        Approver vicePresident = new VicePresident("王副总");
        Approver president = new President("刘总");
        Approver meeting = new Congress("董事会");

        // 创建责任链
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(meeting);

        // 创建一个购买请求
        PurchaseRequest p1 = new PurchaseRequest(49999,12,"采购1");
        PurchaseRequest p2 = new PurchaseRequest(50001,12,"采购2");
        PurchaseRequest p3 = new PurchaseRequest(100001,12,"采购3");
        PurchaseRequest p4 = new PurchaseRequest(150001,12,"采购4");

        // 由责任链的初始端开始处理请求
        director.processRequest(p1);
        director.processRequest(p2);
        director.processRequest(p3);
        director.processRequest(p4);
    }
}