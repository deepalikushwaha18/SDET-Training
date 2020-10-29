package JavaActivity2;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		
		int[] numArr = { 10, 77, 10, 54, -11, 10 };
		// Set constants
		System.out.println("Arrary"+ Arrays.toString(numArr));

		int requiredSum = 30;
		System.out.println("Result: " + result(numArr, requiredSum));
	}

	public static boolean result(int[] numbers, int requiredSum) {
		int sum = 0;
		for (int number : numbers) {

			if (number == 10) {
				// sum=sum+requiredNum
				sum += 10;

//					System.out.println("sum is"+sum);
			}

			// Sum should not be more than 30
			if (sum > requiredSum) {
				break;
			
			}
			System.out.println("total"+sum);
		}
		return sum == requiredSum;
		
	}
}
