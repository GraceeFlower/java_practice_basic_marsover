package com;

public class Car {
    public static void main(String[] args) {
        North north = new North();

        Direction car = new Direction(north);
        char direction = north.getDirect();
        System.out.println("小车现在的方位是：" + direction);
        System.out.println("小车左转之后的方位是：" + car.turnLeft());
        System.out.println("小车右转之后的方位是：" + car.turnRight());
    }
}