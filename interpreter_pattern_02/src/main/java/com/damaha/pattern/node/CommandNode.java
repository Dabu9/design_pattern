package com.damaha.pattern.node;

import com.damaha.pattern.context.Context;

/**
 * 一个command语句由LOOP或者普通语句单个或多个组合
 * 因此其解释功能就是将其拆分
 */
public class CommandNode extends Node{
    private Node node;
    @Override
    public void interpret(Context context) {
        if (context.currentToken().equalsIgnoreCase("LOOP")){
            // 处理循环
            node = new LoopCommandNode();
            node.interpret(context);
        }
        else {
            // 处理其他
            node = new PrimitiveCommandNode();
            node.interpret(context);
        }
    }

    @Override
    public void execute() {
        node.execute();
    }
}
