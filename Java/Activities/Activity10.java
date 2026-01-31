package Activity;

import java.util.HashSet;

public class Activity10 {
	public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // Add elements to HashSet
        hs.add("I");
        hs.add("B");
        hs.add("M");
        hs.add("F");
        hs.add("S");
        hs.add("T");
        
        // HashSet
        System.out.println("Original HashSet: " + hs);        
        // size of HashSet
        System.out.println("Size of HashSet: " + hs.size());
        
        // Remove element
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        // Remove element that is not present
        if(hs.remove("Z")) {
        	System.out.println("Z removed from the Set");
        } else {
        	System.out.println("Z is not present in the Set");
        }
        
        // Search for element
        System.out.println("Checking if M is present: " + hs.contains("M"));
        // Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}
