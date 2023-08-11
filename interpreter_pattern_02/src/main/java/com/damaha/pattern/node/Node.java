package com.damaha.pattern.node;

import com.damaha.pattern.context.Context;

public abstract class Node {
    public abstract void interpret(Context context);
    public abstract void execute();
}
