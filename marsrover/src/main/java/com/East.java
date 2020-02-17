package com;

public class East implements ChooseDirection {

    @Override
    public Direction turnLeft() {
        return new Direction('N', new East());
    }

    @Override
    public Direction turnRight() {
        return new Direction('S', new East());
    }
}
