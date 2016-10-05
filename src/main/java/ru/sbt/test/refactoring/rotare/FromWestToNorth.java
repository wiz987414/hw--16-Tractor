package ru.sbt.test.refactoring.rotare;

import ru.sbt.test.refactoring.moving.MoveToNorth;
import ru.sbt.test.refactoring.moving.Moving;

class FromWestToNorth implements Rotating {
    public Moving rotate(RotateContext context) {
        context.updateState(new FromNorthToEast());
        return new MoveToNorth();
    }
}
