package com.damaha.pattern;

import com.damaha.pattern.command.HelpCommand;
import com.damaha.pattern.command.MinimizeCommand;
import com.damaha.pattern.invoker.FunctionButton;

public class Main {
    public static void main(String[] args) {
        FunctionButton fb1 = new FunctionButton("功能键1");
        fb1.setCommand(new MinimizeCommand());

        FunctionButton fb2 = new FunctionButton("功能键2");
        fb2.setCommand(new HelpCommand());


        FBSettingWindow fbw = new FBSettingWindow("我的窗口");
        fbw.addFunctionButton(fb1);
        fbw.addFunctionButton(fb2);

        fbw.display();
        System.out.println("---------------------------------------");
        fb1.onclick();
        fb2.onclick();

    }
}