package com.damaha.pattern;

import com.damaha.pattern.node.*;

import java.util.Stack;

public class InstructionHandler {
    private AbstractNode node;
    public void handle(String instruction){
        AbstractNode left = null,right=null;
        AbstractNode direction = null;
        AbstractNode distance = null;
        AbstractNode action = null;

        Stack<AbstractNode> stack = new Stack<>();  // 声明一个栈对象，用来存储抽象语法树
        String[] words = instruction.split(" ");   //用空格分割

        for (String word:words){
            System.out.println(word);
        }
        for (int i=0;i<words.length;i++){
            if(words[i].equalsIgnoreCase("and")){
                left = (AbstractNode)stack.pop();

                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);

                right = new SentenceNode(direction,action,distance);
                stack.push(new AndNode(left,right));
            }
            else {
                String word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction,action,distance);
                stack.push(left);
            }
        }
        this.node = (AbstractNode) stack.pop();
    }

    public String output(){
        String result = node.interpret();
        return result;
    }
}
