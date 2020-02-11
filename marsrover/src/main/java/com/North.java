package com;

public class North extends Direction implements ChooseDirection {

    public North(char direction) {
        super(direction);
    }

    @Override
    public Direction turnLeft() {
        return new Direction('W');
    }

    @Override
    public Direction turnRight() {
        return new Direction('E');
    }
}
