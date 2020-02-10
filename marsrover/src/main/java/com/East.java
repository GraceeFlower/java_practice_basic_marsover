package com;

public class East implements Directions {
    @Override
    public String getLeft() {
        return "S";
    }

    @Override
    public String getRight() {
        return "N";
    }
}
