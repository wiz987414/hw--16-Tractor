package ru.sbt.test.refactoring.command;

import ru.sbt.test.refactoring.Tractor;

public class RotateCommand implements Command {
    public Tractor execute(Tractor tractor) {
        return tractor.turnClockwise();
    }
}
