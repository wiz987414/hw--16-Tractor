package ru.sbt.test.refactoring.rotare;

import ru.sbt.test.refactoring.moving.MoveToWest;
import ru.sbt.test.refactoring.moving.Moving;

class FromSouthToWest implements Rotating {
    public Moving rotate(RotateContext context) {
        context.updateState(new FromWestToNorth());
        return new MoveToWest();
    }
}
