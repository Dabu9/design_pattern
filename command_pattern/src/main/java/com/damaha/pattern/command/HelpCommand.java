package com.damaha.pattern.command;

import com.damaha.pattern.handler.HelpHandler;
import com.damaha.pattern.handler.WindowHandler;

public class HelpCommand extends Command{
    HelpHandler helpHandler;  // 维持对请求接受者的引用

    public HelpCommand() {
        helpHandler = new HelpHandler();
    }

    @Override
    public void execute() {
        helpHandler.display();
    }
}
