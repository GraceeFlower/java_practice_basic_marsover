package com;

public class North implements Directions {

    @Override
    public char getLeft() {
        return 'W';
    }

    @Override
    public char getRight() {
        return 'E';
    }
}
