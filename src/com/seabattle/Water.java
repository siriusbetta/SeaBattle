package com.seabattle;

public class Water{
	//private Ship ship;
	//if dangerWater is 0 the field is clear, 1 connects with ship and -1 is busy by ship
	private int dangerWater;
	
	int x;
	int y;
	
	public Water(int x, int y) {
		this.x = x;
		this.y = y;
		
		setDangerWater(0);
	}

	public int getDangerWater() {
		return dangerWater;
	}

	public void setDangerWater(int dangerWater) {
		this.dangerWater = dangerWater;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dangerWater;
		result = prime * result + x;
		result = prime * result + y;
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
		Water other = (Water) obj;
		if (dangerWater != other.dangerWater)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public String toString(){
		return String.valueOf(x) + String.valueOf(y) ;
	}
	
}
