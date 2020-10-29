package Collection;

import java.util.HashSet;

public class HashSet_Activity3_2 {

	    public static void main(String[] args) {
			
		        HashSet<String> hs = new HashSet<String>();
			
		        // Adding element to HashSet
			
		        hs.add("Monkey");
			
		        hs.add("Lion");
			
		        hs.add("Cat");
			
		        hs.add("Dog");
			
		        hs.add("Wolf");
			
		        hs.add("Sheep");
			
		        
			
		        //Print HashSet
			
		        System.out.println("Original HashSet: " + hs);        
			
		        //Print size of HashSet
			
		        System.out.println("Size of HashSet: " + hs.size());
			
		        
			
		        //Remove element
			
		        System.out.println("Removing A from HashSet: " + hs.remove("Cat"));
			
		        //Remove element that is not present
			
		        if(hs.remove("Dog")) {
			
		        	System.out.println("Dog removed from the Set");
			
		        } else {
			
		        	System.out.println("Dog is not present in the Set");
			
		        }
			
		        
			
		        //Search for element
			
		        System.out.println("Checking if Monkey is present: " + hs.contains("Monkey"));
			
		        //Print updated HashSet
			
		        System.out.println("Updated HashSet: " + hs);
			
		    }
			
		}

