package week3.day2;

import java.util.ArrayList;

import java.util.List;


public class FindInterSectionUsingList {
	public static void main(String[] args) {
		Integer arr[]= {3, 2, 11, 4, 6, 7} ;
		Integer arr1[]= {1,2,8,4,9,7};
	
		//List<Integer> list1=new Arrays.asList(arr);
		//List<Integer> list2=Arrays.asList(arr1);
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i:arr) {
			list.add(i);
		}
		for(int i:arr1) {
			list1.add(i);
		}
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list1.size();j++) {
				if(list.get(i)==list1.get(j)) {
					System.out.println(list.get(i));
				}
			}
		}
		
		
		
		

	}

}
