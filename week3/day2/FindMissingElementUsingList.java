package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class FindMissingElementUsingList {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,10,6,8};
		List<Integer> list=new ArrayList<Integer>();
		for(int l:arr) {
			list.add(l);
		}
	
		Collections.sort(list);
		System.out.println(list);
		int numbersArrayIndex = 0;
		
		for (int i = 1; i<=10; i++) {
		    if (i== list.get(numbersArrayIndex) ) {
		        numbersArrayIndex++;
		    }
		    else {
		        System.out.println(i);
		    }
		}
		

		


	}

}
