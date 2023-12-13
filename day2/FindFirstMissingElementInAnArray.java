package week1.day2;

import java.util.Arrays;

public class FindFirstMissingElementInAnArray {

	public static void main(String args[]) {
		int[] arr = {1,2,3,4,7,9,6};
		Arrays.sort(arr);

		System.out.println("missing number");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==i+1) {
				continue;
			}
			else {
				System.out.println(i+1);
				break;
			}
		}



	}
}
