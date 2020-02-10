package com;

public class Direction {

  Directions direction;

  public Direction(Directions direction) {
    this.direction = direction;
  }

  public char turnLeft() {
    return direction.getLeft();
  }

  public char turnRight() {
    return direction.getRight();
  }
}