package ru.sbt.test.refactoring.tarctorParameters;

public class Field {
    private final int fieldWidth;
    private final int fieldHeight;

    public Field(int fieldWidth, int fieldHeight) {
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;
    }

    public int getFieldWidth() {
        return fieldWidth;
    }

    public int getFieldHeight() {
        return fieldHeight;
    }
}
