package com.damaha.pattern.node;

import com.damaha.pattern.context.Context;

public class LoopCommandNode extends Node{
    private Integer number; // 表示循环次数
    private Node commandNode;
    @Override
    public void interpret(Context context) {
        // LOOP 2 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END
        context.skipToken("LOOP");  // LOOP不解释
        number = context.currentNumber();
        context.nextToken();
        commandNode = new ExpressionNode(); // 循环语句中的表达式
        commandNode.interpret(context);
    }

    @Override
    public void execute() {
        for (int i = 0;i<number;i++){
            commandNode.execute();
        }
    }
}
