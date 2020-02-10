package com;

public class West implements Directions {

    @Override
    public char getLeft() {
        return 'N';
    }

    @Override
    public char getRight() {
        return 'S';
    }
}
