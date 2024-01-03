package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacterSet {
	public static void main(String[] args) {
		String input="babu";
		char charArray[]=input.toCharArray();
		Set<Character> str=new LinkedHashSet<Character>();
		
		for(char c:charArray) {
			boolean add = str.add(c);
			if(!add) {
				str.remove(c);	
			}
		}
		
		String output="";
		for(Character ch:str) {
			output=output+ch;
		}
		
		System.out.println(output);
		
	}

}
