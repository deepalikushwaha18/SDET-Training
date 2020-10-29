package JavaActivity_File;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity1_4 {

	public static void main(String[] args) {


//	    In this activity, accept number inputs from the console using Scanner class and store them in an array.
		
		Scanner scanObj = new Scanner(System.in);
		List<Integer> listObj = new ArrayList<Integer>();
		Random indexGen = new Random();
		 System.out.print("Enter integers please ");
	        System.out.println("(EOF or non-integer to terminate): ");
		
		while(scanObj.hasNextInt()){
			listObj.add(scanObj.nextInt());
		}
//	    Then use the Random class to generate an index value and print the value in the array at then generated index value.
//	    To start create a class RandomScannerActivity with a main() method with the following objects:
//        Create a Scanner object named scanObj.
//        Create an ArrayList object named listObj.
//        Create a Random class object named indexGen.		

        Integer nums[] = listObj.toArray(new Integer[0]);
        int index = indexGen.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);

        scanObj.close();
    }




	}
