package com.damaha.pattern.chain;

import com.damaha.pattern.request.PurchaseRequest;

public abstract class Approver {
    protected Approver successor;    // 继承者
    protected String name;  // 管理者名称

    public Approver(String name){
        this.name = name;
    }
    public void setSuccessor(Approver successor){
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);
}
