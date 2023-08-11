package com.damaha.pattern.command;

import com.damaha.pattern.handler.WindowHandler;

public class MinimizeCommand extends Command{
    WindowHandler windowHandler;

    public MinimizeCommand() {
        windowHandler = new WindowHandler();
    }
    @Override
    public void execute() {
        windowHandler.minimize();
    }
}
