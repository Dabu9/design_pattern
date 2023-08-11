package com.damaha.pattern.chain;

import com.damaha.pattern.request.PurchaseRequest;

/**
 * 董事会审批
 */
public class Congress extends Approver{
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount()<200000){
            System.out.println("--------------------------");
            System.out.println("采购目的："+request.getPurpose()+"，金额："+request.getAmount()+"，数量："+request.getNumber());
            System.out.println("由"+this.name+"审批");
            System.out.println("--------------------------");        }
        else {
            this.successor.processRequest(request);
        }
    }
}
