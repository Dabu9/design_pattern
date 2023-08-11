package com.damaha.pattern;

public class Main {
    public static void main(String[] args) {
        String i1 = "up move 5 and down run 10";
        String i2 = "up move 5 and down run 10 and down run 10";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(i2);
        System.out.println(handler.output());

    }
}