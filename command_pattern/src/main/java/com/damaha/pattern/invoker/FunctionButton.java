package com.damaha.pattern.invoker;

import com.damaha.pattern.command.Command;

public class FunctionButton {
    private String name;
    private Command command; // 维持对于抽象命令者的引用

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //通过setter注入命令
    public void setCommand(Command command) {
        this.command = command;
    }


    //关联
    public void onclick(){
        System.out.println("点击"+this.name);
        command.execute();
        System.out.println("---------------------------------------");
    }
}
