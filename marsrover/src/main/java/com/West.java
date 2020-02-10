package com;

public class West implements Directions {

    @Override
    public char getDirect() {
        return 'W';
    }

    @Override
    public char getLeft() {
        return 'N';
    }

    @Override
    public char getRight() {
        return 'S';
    }
}
