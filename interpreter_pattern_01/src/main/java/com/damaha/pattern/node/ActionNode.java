package com.damaha.pattern.node;

public class ActionNode extends AbstractNode{
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        return this.action;
    }
}
