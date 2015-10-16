package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){
	}
	
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		//to be implemented
		int score = 0;
		
		for(int i=0; i < frames.size(); i++)
		{
			score += frames.get(i).score();
			//if not the first one count the bonus
			if(i>0)
				score += calculateTheBonus( i, frames.get(i), frames.get(i-1));
		}
		return score;
	}

	private int calculateTheBonus(int i, Frame currentFrame, Frame previous, Frame next) {
		int bonus = 0;
		if( previous.isSpare() )
			bonus += currentFrame.getFirstThrow();
		else if( previous.isStrike() )
			if (currentFrame.isStrike() && frames.size()>=i+1 )
				bonus += currentFrame.getFirstThrow() + frames.get(i+1).getFirstThrow();
			else
				bonus += frames.get(i).score();
		return bonus;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
