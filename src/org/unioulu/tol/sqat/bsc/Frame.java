package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		if( validateValues(firstThrow, secondThrow) )
			throw Exception("Wrong values");
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	private boolean validateValues(int firstThrow2, int secondThrow2) {
		if(for)
		return false;
	}

	//the score of a single frame
	public int score(){
		return firstThrow+secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		if( firstThrow < 10 && score() == 10)
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

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}
}
