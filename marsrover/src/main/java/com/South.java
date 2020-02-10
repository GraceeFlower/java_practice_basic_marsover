package com;

public class South implements Directions {
    @Override
    public char getDirect() {
        return 'S';
    }

    @Override
    public char getLeft() {
        return 'E';
    }

    @Override
    public char getRight() {
        return 'W';
    }
}
