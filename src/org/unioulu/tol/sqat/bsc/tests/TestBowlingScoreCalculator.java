package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;

public class TestBowlingScoreCalculator {

	@Test
	public void testGetScoreAtTheBeginningOfTheGameZero() {
	//
	BowlingGame bowlingGame = new BowlingGame();	
	 assertEquals(0,bowlingGame.score());
	}
	
	@Test
	public void testGetScoreAtTheBeginningOfTheGameZero() {
	//
	BowlingGame bowlingGame = new BowlingGame();	
	 assertEquals(0,bowlingGame.score());
	}

}
