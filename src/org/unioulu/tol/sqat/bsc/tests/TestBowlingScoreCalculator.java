package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void testGetScoreAtTheBeginningOfTheGameZero() {
	//
	BowlingGame bowlingGame = new BowlingGame();	
	 	assertEquals(0,bowlingGame.score());
	}
	
	@Test
	public void testPlayOneFrameOfGameSeeThatFrameIsAdded() {
	//
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(10,0);
		bowlingGame.addFrame(frame) ;
		assertEquals(10,bowlingGame.score());	 
	}
	
	@Test
	public void testPlayOneFrameOfGameSeeThatFrameIsAdded() {
	//
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(10,0);
		bowlingGame.addFrame(frame) ;
		assertEquals(10,bowlingGame.score());	 
	}

}
