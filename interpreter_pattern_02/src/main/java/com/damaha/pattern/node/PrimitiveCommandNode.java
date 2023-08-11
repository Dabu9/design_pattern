package com.damaha.pattern.node;

import com.damaha.pattern.context.Context;

public class PrimitiveCommandNode extends Node{
    private String name;  // 名字 小龙女 阳过 之类
    private String text;  // 指令：PRINT END 之类
    @Override
    public void interpret(Context context) {
        // PRINT 杨过 SPACE SPACE PRINT 小龙女
        name = context.currentToken();
        context.skipToken(name);
        // 判断第一个词，如果不是关键字，直接报错
        if (!name.equalsIgnoreCase("PRINT") &&
                !name.equalsIgnoreCase("BREAK")&& !name.equalsIgnoreCase("SPACE")){
            System.err.println("非法命令！");
        }
        if(name.equalsIgnoreCase("PRINT")){
            text = context.currentToken();
            context.nextToken();
        }
    }

    @Override
    public void execute() {
        if (name.equalsIgnoreCase("PRINT")){
            System.out.print(text);
        } else if (name.equalsIgnoreCase("SPACE")) {
            System.out.print(" ");
        } else if (name.equalsIgnoreCase("BREAK")) {
            System.out.println();
        }
    }
}
