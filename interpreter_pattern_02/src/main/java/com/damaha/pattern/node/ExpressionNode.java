package com.damaha.pattern.node;

import com.damaha.pattern.context.Context;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 表达式，包含多条命令。
 * 因此它的解释功能就是为了将多条命令进行划分
 */
public class ExpressionNode extends Node{
    ArrayList<Node> list = new ArrayList<>();   // 表示命令的集合
    @Override
    public void interpret(Context context) {
        // 通过Context间接遍历
        while (true){
            // 如果没有Token了
            if (context.currentToken()==null){
                break;
            }
            // 如果是END，则不解释，也就是跳过解释END，并且结束本次解释
            else if (context.currentToken().equalsIgnoreCase("END")){
                context.skipToken("END");
                break;
            }
            else {
                Node commandNode = new CommandNode();
                commandNode.interpret(context);
                list.add(commandNode);
            }

        }
    }

    @Override
    public void execute() {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            ((Node)iterator.next()).execute();
        }
    }
}
