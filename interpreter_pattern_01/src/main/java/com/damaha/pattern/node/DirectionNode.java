package com.damaha.pattern.node;

public class DirectionNode extends AbstractNode{
    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpret() {
        return this.direction;
    }
}
