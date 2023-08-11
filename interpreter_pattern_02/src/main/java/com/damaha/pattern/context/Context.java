package com.damaha.pattern.context;

import java.util.StringTokenizer;

/**
 * 充当环境角色
 */
public class Context {
    private StringTokenizer tokenizer;   // 将字符串分解为更小的字符
    private String currentToken;    // 当前字符串标记
    public Context(String text){
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    // 返回下一个标记
    public String nextToken(){
        if (tokenizer.hasMoreTokens()){
            currentToken = tokenizer.nextToken();
        }else {
            currentToken = null;
        }
        return currentToken;
    }
    // 返回当前标记
    public String currentToken(){
        return currentToken;
    }
    // 跳过一个标记
    public void skipToken(String token){
        if(!token.equals(currentToken)){
            System.err.println("错误提示："+currentToken+"解释错误！");
        }
        nextToken();
    }
    // 如果当前标记的是一个数组，则返回对应的数值
    public int currentNumber(){
        int number = 0;
        try{
            number = Integer.parseInt(currentToken); // 将字符串转为整数

        }catch (NumberFormatException e){
            System.err.println("错误提示：" + e);
        }
        return number;
    }

}
