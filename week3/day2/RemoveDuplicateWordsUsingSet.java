package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicateWordsUsingSet {
	public static void main(String[] args) {
		String input="We learn Java basics as part of java sessions in java week1";
		String str[]=input.split(" ");
		Set<String> output=new LinkedHashSet<String>();
		for(String s:str) {
			output.add(s);
		}
		String result="";
		for(String o:output) {
			result=result+o+" ";
		}
		System.out.println(result);
		
	}

}
