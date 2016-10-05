package ru.sbt.test.refactoring.rotare;

import ru.sbt.test.refactoring.moving.Moving;

import java.util.ArrayList;
import java.util.List;

public class RotateContext {
    private final List<Rotating> stateList;

    public RotateContext() {
        this.stateList = new ArrayList<Rotating>();
        this.stateList.add(new FromNorthToEast());
    }

    private Rotating getCurrentState() {
        return stateList.get(stateList.size() - 1);
    }

    void updateState(Rotating newState) {
        this.stateList.add(newState);
    }

    public Moving rotate() {
        return getCurrentState().rotate(this);
    }
}
