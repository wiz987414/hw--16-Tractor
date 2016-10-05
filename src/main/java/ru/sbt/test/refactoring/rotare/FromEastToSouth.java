package ru.sbt.test.refactoring.rotare;

import ru.sbt.test.refactoring.moving.MoveToSouth;
import ru.sbt.test.refactoring.moving.Moving;

class FromEastToSouth implements Rotating {
    public Moving rotate(RotateContext context) {
        context.updateState(new FromSouthToWest());
        return new MoveToSouth();
    }
}
