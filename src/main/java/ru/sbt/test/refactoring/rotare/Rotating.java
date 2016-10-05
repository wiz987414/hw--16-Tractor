package ru.sbt.test.refactoring.rotare;

import ru.sbt.test.refactoring.moving.Moving;

interface Rotating {
    Moving rotate(RotateContext context);
}
