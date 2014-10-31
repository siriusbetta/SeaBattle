package com.seabattle;

import java.util.List;

public class Destroyer extends Ship implements HorizontalPos, VerticalPos{
	private final String shipName = "Destroyer";
	
	List<Integer> coordinatsOfShip;
	int x;
	int y;
	
	List<Integer> verticalPosition;
	List<Integer> horizontalPosition;
	
	public Destroyer() {
		
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
		Destroyer other = (Destroyer) obj;
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


	@Override
	public List<Integer> getVerticalPosition() {
		// TODO Auto-generated method stub
		return verticalPosition;
	}


	@Override
	public List<Integer> getHorizontalPosition() {
		// TODO Auto-generated method stub
		return horizontalPosition;
	}
}
