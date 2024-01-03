package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberUsingList {
	public static void main(String[] args) {
		int arr[]= {3,2,11,4,6,7};
		List<Integer> list=new ArrayList<Integer>();
		for(int i:arr) {
			list.add(i);
		}
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(list.size()-2));
		
		
		
	}

}
