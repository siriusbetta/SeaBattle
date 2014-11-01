package com.seabattle;


public abstract class Ship {
	String shipName;
	
	int lengthOfShip;
	
	Orientation orientation;
	
	int orientOnField = 0;
	
	int x;
	int y;
	
	
	public void setOrientation(){
		orientation.verticalOrHorizont();
	}
}
