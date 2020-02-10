package com;

public class East implements Directions {

    @Override
    public char getDirect() {
        return 'E';
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
