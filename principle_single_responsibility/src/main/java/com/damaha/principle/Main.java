package com.damaha.principle;

public class Main {
    public static void main(String[] args) {
        System.out.println("违反单一设计原则");
        Vehicle01 vehicle01 = new Vehicle01();
        vehicle01.run("汽车");
        vehicle01.run("飞机");
        vehicle01.run("轮船");
        System.out.println("---------------------------------");
        System.out.println("完全遵循单一设计原则");
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        roadVehicle.run("摩托车");
        SkyVehicle skyVehicle = new SkyVehicle();
        skyVehicle.run("飞机");
        System.out.println("---------------------------------");
        System.out.println("在方法上遵循单一设计原则");
        Vehicle02 vehicle02 = new Vehicle02();
        vehicle02.runRoad("汽车");
        vehicle02.runRoad("摩托车");
        vehicle02.runSky("飞机");

    }

    /**
     * 方案一
     */
    static class Vehicle01{
        public void run(String Vehicle){
            System.out.println(Vehicle+"在公路上运行");
        }
    }

    /**
     * 方案2
     */
    static class RoadVehicle{
        public void run(String Vehicle){
            System.out.println(Vehicle+"在公路上运行");
        }
    }
    static class SkyVehicle{
        public void run(String Vehicle){
            System.out.println(Vehicle+"在天空上运行");
        }
    }

    static class Vehicle02{
        public void runRoad(String Vehicle){
            System.out.println(Vehicle+"在公路上运行");
        }
        public void runSky(String Vehicle){
            System.out.println(Vehicle+"在天空上运行");
        }
    }
}