package com;

public class West implements Directions {
    @Override
    public String getLeft() {
        return "N";
    }

    @Override
    public String getRight() {
        return "S";
    }
}
