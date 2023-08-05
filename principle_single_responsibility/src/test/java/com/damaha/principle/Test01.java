package com.damaha.principle;

import org.junit.Test;

public class Test01 {
    @Test
    public void runMain(){
        run("汽车");
        run("火车");
        run("轮船");
    }

    public void run(String Vehicle){
        System.out.println(Vehicle+"在公路上运行");
    }
}
