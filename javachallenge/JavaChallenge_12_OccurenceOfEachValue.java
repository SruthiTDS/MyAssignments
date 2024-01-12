package javachallenge;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class JavaChallenge_12_OccurenceOfEachValue {
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,1,1};
		Set<Integer>s=new LinkedHashSet<Integer>();
		Arrays.sort(arr);
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;		
				}
				else {
					break;
				}
			}
			System.out.println(arr[i]+"---> "+count);
			
 			i+=(count-1);
 			if(s.contains(count)) {
 				flag=true;
 				break;
 			}
 			else {
 				s.add(count);
 			}
		}
		if(flag) {
			System.out.println(false+" "+"Same count repeated");
		}
		else {
			System.out.println(true+" "+"count not repeated");
		}
			
	}
	
}
