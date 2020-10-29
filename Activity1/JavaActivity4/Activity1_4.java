package JavaActivity4;

import java.util.Arrays;

public class Activity1_4 {

	public static void main(String[] args) {
		int[] no = {12, 4, 5, 2, 5};
		
		for (int i = 1; i < no.length; i++) {
            int key = no[i];
            int j = i - 1;
            
            System.out.println("For Loop key: " + key + " & j: "+ j);
            
            while (j >= 0 && key < no[j]) {
                no[j + 1] = no[j];
                --j;
                System.out.println(" While Loop j: "+ j);
            }
            no[j + 1] = key;
        }
		
		 System.out.println("Sorted Array :");
	        System.out.println(Arrays.toString(no));
		
	}

}
