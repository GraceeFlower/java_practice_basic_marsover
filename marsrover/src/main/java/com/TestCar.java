package com;

public class TestCar {

  public static void main(String[] args) {
    Car testCar = new Car(Direction.W);
    System.out.print("小车左转之后方向为：");
    testCar.turnLeft();
    System.out.print("小车右转之后方向为：");
    testCar.turnRight();
  }
}
