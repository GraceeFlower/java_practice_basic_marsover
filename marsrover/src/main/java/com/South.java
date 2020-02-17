package com;

public class South implements ChooseDirection {

    @Override
    public Direction turnLeft() {
        return new Direction('E', new South());
    }

    @Override
    public Direction turnRight() {
        return new Direction('W', new South());
    }
}
