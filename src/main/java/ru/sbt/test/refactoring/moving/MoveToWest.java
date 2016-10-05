package ru.sbt.test.refactoring.moving;

import ru.sbt.test.refactoring.tarctorParameters.Position;

public class MoveToWest implements Moving {
    public Position moveTo(Position basePosition) {
        return new Position(basePosition.getStateX() - 1, basePosition.getStateY());
    }
}
