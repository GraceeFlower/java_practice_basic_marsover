package com;

public class East implements Directions {

    @Override
    public char getDirect() {
        return 'E';
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
