package com;

public class East extends Direction implements ChooseDirection {

    public East(char direction) {
        super(direction);
    }

    @Override
    public Direction turnLeft() {
        return new East('N');
    }

    @Override
    public Direction turnRight() {
        return new East('S');
    }
}
