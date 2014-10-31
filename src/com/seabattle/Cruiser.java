package com.seabattle;

public class Cruiser extends Ship{
	private final String shipName = "Cruiser";
	
	
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
		Cruiser other = (Cruiser) obj;
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
}
