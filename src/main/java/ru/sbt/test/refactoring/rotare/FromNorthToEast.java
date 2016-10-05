package ru.sbt.test.refactoring.rotare;

import ru.sbt.test.refactoring.moving.MoveToEast;
import ru.sbt.test.refactoring.moving.Moving;

class FromNorthToEast implements Rotating {
    public Moving rotate(RotateContext context) {
        context.updateState(new FromEastToSouth());
        return new MoveToEast();
    }
}
