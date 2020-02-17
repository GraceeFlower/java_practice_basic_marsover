package com;

public enum Direction implements ChooseDirection {
  N{
    @Override
    public Direction turnLeft() {
      return Direction.W;
    }

    @Override
    public Direction turnRight() {
      return Direction.E;
    }
  },

  S {
    @Override
    public Direction turnLeft() {
      return Direction.E;
    }

    @Override
    public Direction turnRight() {
      return Direction.W;
    }
  },

  E {
    @Override
    public Direction turnLeft() {
      return Direction.N;
    }

    @Override
    public Direction turnRight() {
      return Direction.S;
    }
  },

  W {
    @Override
    public Direction turnLeft() {
      return Direction.S;
    }

    @Override
    public Direction turnRight() {
      return Direction.N;
    }
  };
}