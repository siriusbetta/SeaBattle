package com.seabattle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleShip extends Ship implements HorizontalPos, VerticalPos{
	
	private final String shipName = "Battleship";
	
	private final int lengthOfShip = 4;
	
	List<Integer> verticalPosition;
	List<Integer> horizontalPosition;
	
	boolean orientation;
	
	int x;
	int y;
	
	public BattleShip(int x, int y) {
		this.x = x;
		this.y = y;
		verticalPosition = new ArrayList<Integer>();
		horizontalPosition = new ArrayList<Integer>();
		
		Random rnd = new Random();
		if(rnd.nextInt(1) == 0){
			orientation = false;
		}else{
			orientation = true;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((shipName == null) ? 0 : shipName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BattleShip other = (BattleShip) obj;
		if (shipName == null) {
			if (other.shipName != null)
				return false;
		} else if (!shipName.equals(other.shipName))
			return false;
		return true;
	}


	public String toString(){
		return shipName;
	}
	
	public int getLength(){
		return lengthOfShip;
	}

	@Override
	public List<Integer> getVerticalPosition() {
		
		if(orientation){
			for(int i = 0; i < lengthOfShip; i++){
				verticalPosition.add(y++);
			}
		}
		return verticalPosition;
	}

	@Override
	public List<Integer> getHorizontalPosition() {
		if(!orientation){
			for(int i = 0; i < lengthOfShip; i++){
				horizontalPosition.add(x++);
			}
		}
		return horizontalPosition;
	}

}
