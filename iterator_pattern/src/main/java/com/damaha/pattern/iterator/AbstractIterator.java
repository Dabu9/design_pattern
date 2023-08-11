package com.damaha.pattern.iterator;

public abstract class AbstractIterator {
    public abstract void next();
    public abstract boolean isLast();
    public abstract void previous();
    public abstract boolean isFirst();
    public abstract Object getNextItem();
    public abstract Object getPreviousItem();
}
