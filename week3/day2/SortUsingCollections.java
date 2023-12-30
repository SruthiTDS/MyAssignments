package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {
	public static void main(String[] args) {
		String[] str= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> l=new ArrayList<String>();
		
		for(String s:str) {
			l.add(s);
		}
		Collections.sort(l);
		//Reverse list
		for(int i=l.size()-1;i>=0;i--) {
			System.out.println(l.get(i));
		}
		
		
	}

}
