package com.damaha.pattern;

import com.damaha.pattern.invoker.FunctionButton;

import java.util.ArrayList;

public class FBSettingWindow {
    private String title;
    private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();   // 用于存储不同的功能按键

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton fb){
        functionButtons.add(fb);
    }
    public void removeFunctionButton(FunctionButton fb){
        functionButtons.remove(fb);
    }

    public void display(){
        System.out.println("窗口功能：");
        for (FunctionButton obj:functionButtons){
            System.out.println(obj.getName());
        }
    }
}
