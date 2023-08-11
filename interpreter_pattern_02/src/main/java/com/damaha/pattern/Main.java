package com.damaha.pattern;

import com.damaha.pattern.context.Context;
import com.damaha.pattern.node.ExpressionNode;
import com.damaha.pattern.node.Node;

public class Main {
    public static void main(String[] args) {
        String text="LOOP 2 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END PRINT 郭靖 SPACE SPACE PRINT 黄蓉";
        Context context = new Context(text);
        Node node = new ExpressionNode();
        node.interpret(context);
        node.execute();
    }
}