package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void testGetScoreAtTheBeginningOfTheGameScoreZero() {
	//
	BowlingGame bowlingGame = new BowlingGame();	
	 	assertEquals(0,bowlingGame.score());
	}
	
	@Test
	public void testPlayOneFrameOfGameScore10() {
	//
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(10,0);
		bowlingGame.addFrame(frame) ;
		assertEquals(10,bowlingGame.score());	 
	}
	
	@Test
	public void testPlayTwoFrameWithOneSpareScore20() {
	//
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(5,5);
		bowlingGame.addFrame(frame) ;
		Frame frame2 = new Frame(5,0);
		bowlingGame.addFrame(frame2) ;
		assertEquals(20,bowlingGame.score());	 
	}
	
	@Test
	public void testPlayTwoFrameWithFirstStrikeScore26() {
	//
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(10,0);
		bowlingGame.addFrame(frame) ;
		Frame frame2 = new Frame(5,3);
		bowlingGame.addFrame(frame2) ;
		assertEquals(26,bowlingGame.score());	 
	}
	
	@Test
	public void testPlayThreeFramesWithFirstTwoStrikeScore45() {
	//
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(10,0);
		bowlingGame.addFrame(frame) ;
		Frame frame2 = new Frame(10,0);
		bowlingGame.addFrame(frame2) ;
		Frame frame3 = new Frame(5,0);
		bowlingGame.addFrame(frame3);
		
		assertEquals(45,bowlingGame.score());	 
	}
	
	@Test
	public void testPlayFourFramesWithFirstTwoStrikeScore50() {
	//
		BowlingGame bowlingGame = new BowlingGame();
		Frame frame = new Frame(10,0);
		bowlingGame.addFrame(frame) ;
		Frame frame2 = new Frame(10,0);
		bowlingGame.addFrame(frame2) ;
		Frame frame3 = new Frame(5,0);
		bowlingGame.addFrame(frame3);
		Frame frame4 = new Frame(5,0);
		bowlingGame.addFrame(frame4);
		assertEquals(50,bowlingGame.score());	 
	}
	
	@Test
	public void testPlay10FramesLastOneNotStrikeOrSpare() {
	//
		BowlingGame bowlingGame = new BowlingGame();
		create10FrameLastOneNotBonus(bowlingGame);
		
		assertEquals(261,bowlingGame.score());	
	}
	
	@Test
	public void testPlay10FramesLastOneNotStrikeOrSpareTryToPlayOneMoreFrame() {
	//
		BowlingGame bowlingGame = new BowlingGame();
		create10FrameLastOneNotBonus(bowlingGame);
		bowlingGame.addFrame(new Frame(10,0));
	}


	private void create10FrameLastOneNotBonus( BowlingGame bowlingGame)
	{
		bowlingGame.addFrame(new Frame(10,0)); //30
		bowlingGame.addFrame(new Frame(10,0)); //30
		bowlingGame.addFrame(new Frame(10,0)); //30 
		bowlingGame.addFrame(new Frame(10,0)); //30
		bowlingGame.addFrame(new Frame(10,0)); //30
		bowlingGame.addFrame(new Frame(10,0)); //30
		bowlingGame.addFrame(new Frame(10,0)); //30
		bowlingGame.addFrame(new Frame(10,0)); //25
		bowlingGame.addFrame(new Frame(10,0)); //18
		bowlingGame.addFrame(new Frame(5,3)); //8
		//score 
	}
	
	private void createPerfectGame( BowlingGame bowlingGame)
	{
		bowlingGame.addFrame(new Frame(10,0));
		bowlingGame.addFrame(new Frame(10,0));
		bowlingGame.addFrame(new Frame(10,0));
		bowlingGame.addFrame(new Frame(10,0));
		bowlingGame.addFrame(new Frame(10,0));
		bowlingGame.addFrame(new Frame(10,0));
	}
}
