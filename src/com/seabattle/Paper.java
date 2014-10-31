package com.seabattle;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Paper {
	Map<Integer, Water> gameField;
	
	public Paper() {
		gameField = new HashMap<Integer, Water>();
		createNewField();
		
	}
	
	void createNewField(){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j< 10; j++){
				gameField.put(i*10 + j, new Water(i, j));
			}
			
		}
	}
	
	public String toString(){
		String output = "";
		Set<Entry<Integer, Water>> set = gameField.entrySet();
		Iterator<Entry<Integer, Water>> iterator = set.iterator();
		while(iterator.hasNext()){
			Entry<Integer, Water> entry = iterator.next();
			output += entry.getKey() + ", ";
		}
		return output;
	}
}
