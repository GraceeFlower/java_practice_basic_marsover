package com;

public class North implements Directions {
    @Override
    public String getLeft() {
        return "W";
    }

    @Override
    public String getRight() {
        return "E";
    }
}
