package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	private boolean lastFrame = false; 
	
	public Frame(int firstThrow, int secondThrow){
		validateValues(firstThrow, secondThrow);
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	private void validateValues(int firstThrow2, int secondThrow2) {
		if( firstThrow2 > 10 || secondThrow2 > 10)
			throw new RuntimeException("Too much pins knocked.");
		else if( firstThrow2 > 10 || secondThrow2 > 10)
			throw new RuntimeException("Too much pins knocked.");
		else if( firstThrow2 + secondThrow2 > 10)
			throw new RuntimeException("Too much pins knocked on combined.");
	}

	//the score of a single frame
	public int score(){
		return firstThrow+secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if( firstThrow == 10)
			return true;
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if( !isStrike() && score() == 10)
			return true;
		return false;
	}
	
	//returns the value of first throw
	public int getFirstThrow(){

		return firstThrow;
	}
	
	//returns the value of first throw
	public int getSecondThrow(){
		return secondThrow;
	}
	
	//set value to be last frame
	public void setLastFrame(boolean value){
		lastFrame = value;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return lastFrame;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}
}
