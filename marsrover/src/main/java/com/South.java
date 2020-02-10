package com;

public class South implements Directions {
    @Override
    public String getLeft() {
        return "W";
    }

    @Override
    public String getRight() {
        return "E";
    }
}
