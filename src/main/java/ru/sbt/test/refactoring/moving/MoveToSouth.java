package ru.sbt.test.refactoring.moving;

import ru.sbt.test.refactoring.tarctorParameters.Position;

public class MoveToSouth implements Moving {
    public Position moveTo(Position basePosition) {
        return new Position(basePosition.getStateX(), basePosition.getStateY() - 1);
    }
}
