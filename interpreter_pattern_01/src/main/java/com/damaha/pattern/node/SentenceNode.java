package com.damaha.pattern.node;

public class SentenceNode extends AbstractNode{
    private AbstractNode directionNode;
    private AbstractNode actionNode;
    private AbstractNode distanceNode;

    public SentenceNode(AbstractNode directionNode, AbstractNode actionNode, AbstractNode distanceNode) {
        this.directionNode = directionNode;
        this.actionNode = actionNode;
        this.distanceNode = distanceNode;
    }

    @Override
    public String interpret() {
        String action = actionNode.interpret().equalsIgnoreCase("move") ? "移动" : "跑";

        return "向"+directionNode.interpret()+action+distanceNode.interpret()+"步";
    }
}
