package Activity;

import java.util.HashMap;

public class Activity11 {
	public static void main(String[] args) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Pink");
		hash_map.put(2, "Blue");
		hash_map.put(3, "Green");
		hash_map.put(4, "Purpule");
		hash_map.put(5, "Indigo");
	
		//Print map
		System.out.println("The Original Map: " + hash_map);
		
		//Remove one color
		hash_map.remove(5);
		System.out.println("After removing Indigo: " + hash_map);
		
		//Check Color Green exists
		System.out.println("Checking if Green color exists: " + hash_map.containsValue("Green"));
		
		//print the size
		System.out.println("Size of the Map: " + hash_map.size());
	}

}
