package com.damaha.pattern;

import com.damaha.pattern.factory.IgoChessmanFactory;
import com.damaha.pattern.member.Coordinate;
import com.damaha.pattern.member.IgoChessman;

public class Main {
    public static void main(String[] args) {
        IgoChessmanFactory factory1 = IgoChessmanFactory.getInstance();
        IgoChessmanFactory factory2 = IgoChessmanFactory.getInstance();

        IgoChessman b1 = factory1.getIgoChessman("b");
        IgoChessman b2 = factory1.getIgoChessman("b");

        System.out.println(b1);
        System.out.println(b2);

        System.out.println();
        IgoChessman w1 = factory2.getIgoChessman("w");
        IgoChessman w2 = factory2.getIgoChessman("w");

        System.out.println(w1);


        b2.display(new Coordinate(1,2));
        w1.display(new Coordinate(2,3));
    }
}