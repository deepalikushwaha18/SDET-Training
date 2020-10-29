package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Activity_1 {

	public static void main(String[] args) {

//    Create an ArrayList named myList of type String.
		List<String> myList = new ArrayList<String>();
//    Add 5 names to the ArrayList using add() method.
		myList.add("Deepali");
		myList.add("Sam");
		myList.add("kim");
		myList.add("praveen");
		myList.add("sweety");

//    Then print all the names using for loop.
		for (String s : myList) {

			System.out.println("list element---"+s);

		}

//    Then use get() method to retrieve the 3rd name in the ArrayList.
		System.out.println("3rd name---" + myList.get(2));
//    Use contains() method to check if a name exists in the ArrayList.
		System.out.println("presence of myList contain---"+myList.contains("Sam"));
//    Use size() method to print the number of names in the ArrayList.

		System.out.println("Size of myList---"+myList.size());
//    Use remove() method to remove a name from the list and print the size() of the list again.
		myList.remove("Sam");

		System.out.println("new myList---"+myList);
	}
}
