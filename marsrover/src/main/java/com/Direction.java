package com;

public class Direction {
  private final char direction;
  private ChooseDirection chooseDirection;

  public Direction(char direction, ChooseDirection chooseDirection) {
    this.direction = direction;
    this.chooseDirection = chooseDirection;
  }

  public Direction turnLeft() {
    return chooseDirection.turnLeft();
  }

  public Direction turnRight() {
    return chooseDirection.turnRight();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Direction direction1 = (Direction) o;

    if (direction != direction1.direction) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return (int) direction;
  }

  @Override
  public String toString() {
    return "Direction{direction=" + direction + '}';
  }

}