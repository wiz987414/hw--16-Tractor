package ru.sbt.test.refactoring;

import ru.sbt.test.refactoring.command.Command;
import ru.sbt.test.refactoring.moving.*;
import ru.sbt.test.refactoring.rotare.RotateContext;
import ru.sbt.test.refactoring.tarctorParameters.Field;
import ru.sbt.test.refactoring.tarctorParameters.Position;

public class Tractor {
    private final Position position;
    private final Field field;
    private final Moving moving;
    private final RotateContext context;

    Tractor() {
        this.position = new Position(0, 0);
        this.field = new Field(5, 5);
        this.moving = new MoveToNorth();
        this.context = new RotateContext();
    }

    private Tractor(Position position, Field field, Moving moving, RotateContext context) {
        this.position = position;
        this.field = field;
        this.moving = moving;
        this.context = context;
    }

    Tractor move(Command command) {
        return command.execute(this);
    }

    private Position getPosition() {
        return position;
    }

    private Field getField() {
        return field;
    }

    public Moving getMoving() {
        return moving;
    }

    private RotateContext getContext() {
        return context;
    }

    public Tractor moveForwards() {
        Position newPosition = getMoving().moveTo(getPosition());
        if (newPosition.getStateX() > getField().getFieldWidth() ||
                newPosition.getStateY() > getField().getFieldHeight()) {
            throw new TractorInDitchException();
        }
        return new Tractor(newPosition, getField(), getMoving(), getContext());
    }

    public Tractor turnClockwise() {
        return new Tractor(getPosition(), getField(), getContext().rotate(), getContext());
    }

    int getPositionX() {
        return position.getStateX();
    }

    int getPositionY() {
        return position.getStateY();
    }
}
