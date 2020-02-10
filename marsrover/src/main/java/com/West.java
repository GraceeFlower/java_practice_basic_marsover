package com;

public class West implements Directions {

    @Override
    public char getDirect() {
        return 'W';
    }

    @Override
    public char getLeft() {
        return 'S';
    }

    @Override
    public char getRight() {
        return 'N';
    }
}
