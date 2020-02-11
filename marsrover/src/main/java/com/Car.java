package com;

public class Car {
    public static void main(String[] args) {
        Direction car = new South('S');

        System.out.println("小车左转之后的方位是：" + car.turnLeft());
        System.out.println("小车右转之后的方位是：" + car.turnRight());
    }
}