package ru.sbt.test.refactoring.command;

import ru.sbt.test.refactoring.Tractor;

public interface Command {
    Tractor execute(Tractor tractor);
}
