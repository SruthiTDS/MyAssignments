package week1.day2;

import java.util.Arrays;

public class FindFirstMissingElementInAnArray {

	public static void main(String args[]) {
		int[] arr = {1,2,3,4,7,9,6,12};
		Arrays.sort(arr);
		
		System.out.println("missing number");
	
		
		int numbersArrayIndex = 0;
		for(int i=0;i<=arr[arr.length-1];i++) {
			if(i==arr[numbersArrayIndex]) {
				numbersArrayIndex++;
			}
			else {
				System.out.println(i);
			}
		}



	}
}
