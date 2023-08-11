package com.damaha.pattern.factory;

import com.damaha.pattern.member.BlackIgoChessman;
import com.damaha.pattern.member.IgoChessman;
import com.damaha.pattern.member.WhiteIgoChessman;

import java.util.Hashtable;

/**
 * 享元工厂类
 * 通过单例模式实现
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable ht;  // Hashtable来存储变量，充当享元池

    private IgoChessmanFactory(){
        ht = new Hashtable();
        IgoChessman black = new BlackIgoChessman();
        IgoChessman white = new WhiteIgoChessman();
        ht.put("b",black);
        ht.put("w",white);
    }
    public static IgoChessmanFactory getInstance(){
        return instance;
    }

    public static IgoChessman getIgoChessman(String color){
        return (IgoChessman) ht.get(color);
    }
}
