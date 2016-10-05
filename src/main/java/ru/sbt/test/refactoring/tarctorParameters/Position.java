package ru.sbt.test.refactoring.tarctorParameters;

public class Position {
    private final int stateX;
    private final int stateY;

    public Position(int stateX, int stateY) {
        this.stateX = stateX;
        this.stateY = stateY;
    }

    public int getStateX() {
        return stateX;
    }

    public int getStateY() {
        return stateY;
    }
}
