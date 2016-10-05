package ru.sbt.test.refactoring;

import junit.framework.TestCase;
import ru.sbt.test.refactoring.command.MoveCommand;
import ru.sbt.test.refactoring.command.RotateCommand;
import ru.sbt.test.refactoring.moving.MoveToEast;
import ru.sbt.test.refactoring.moving.MoveToNorth;
import ru.sbt.test.refactoring.moving.MoveToSouth;
import ru.sbt.test.refactoring.moving.MoveToWest;

public class TractorTest extends TestCase {

	public void testShouldMoveForward(){
		Tractor tractor = new Tractor();
		tractor = tractor.move(new MoveCommand());
		assertEquals(0, tractor.getPositionX());
		assertEquals(1, tractor.getPositionY());
	}

	public void testShouldTurn(){
		Tractor tractor = new Tractor();
		tractor = tractor.move(new RotateCommand());
		assertEquals(MoveToEast.class, tractor.getMoving().getClass());
		tractor = tractor.move(new RotateCommand());
		assertEquals(MoveToSouth.class, tractor.getMoving().getClass());
		tractor = tractor.move(new RotateCommand());
		assertEquals(MoveToWest.class, tractor.getMoving().getClass());
		tractor = tractor.move(new RotateCommand());
		assertEquals(MoveToNorth.class, tractor.getMoving().getClass());
	}

	public void testShouldTurnAndMoveInTheRightDirection(){
		Tractor tractor = new Tractor();
		tractor = tractor.move(new RotateCommand());
		tractor = tractor.move(new MoveCommand());
		assertEquals(1, tractor.getPositionX());
		assertEquals(0, tractor.getPositionY());
		tractor = tractor.move(new RotateCommand());
		tractor = tractor.move(new MoveCommand());
		assertEquals(1, tractor.getPositionX());
		assertEquals(-1, tractor.getPositionY());
		tractor = tractor.move(new RotateCommand());
		tractor = tractor.move(new MoveCommand());
		assertEquals(0, tractor.getPositionX());
		assertEquals(-1, tractor.getPositionY());
		tractor = tractor.move(new RotateCommand());
		tractor = tractor.move(new MoveCommand());
		assertEquals(0, tractor.getPositionX());
		assertEquals(0, tractor.getPositionY());		
	}
	
	public void testShouldThrowExceptionIfFallsOffPlateau(){
		Tractor tractor = new Tractor();
		tractor = tractor.move(new MoveCommand());
		tractor = tractor.move(new MoveCommand());
		tractor = tractor.move(new MoveCommand());
		tractor = tractor.move(new MoveCommand());
		tractor = tractor.move(new MoveCommand());
		try{
			tractor.move(new MoveCommand());
			fail("Tractor was expected to fall off the plateau");
		}catch(TractorInDitchException ignored){
		}
	}
}
