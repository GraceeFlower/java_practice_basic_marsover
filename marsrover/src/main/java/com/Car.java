package com;

public class Car {
  private Direction currentDirection;

  public Car(Direction currentDirection) {
    this.currentDirection = currentDirection;
  }

  public Car() {
  }

  public void turnLeft() {
    System.out.println(this.currentDirection.turnLeft());
  }

  public void turnRight() {
    System.out.println(this.currentDirection.turnRight());
  }
}