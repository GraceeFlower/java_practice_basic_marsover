package com;

public class North implements ChooseDirection {

    @Override
    public Direction turnLeft() {
        return new Direction('W', new North());
    }

    @Override
    public Direction turnRight() {
        return new Direction('E', new North());
    }
}
