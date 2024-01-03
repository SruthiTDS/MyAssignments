package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	String input="PayPal India";
	char charArray[]=input.toCharArray();
	Set<Character> charSet=new LinkedHashSet<Character>();
	Set<Character> dupcharSet=new LinkedHashSet<Character>();
	for(char c:charArray) {
		boolean add = charSet.add(c);
		if(!add) {
			dupcharSet.add(c);
			charSet.remove(c);
		}
	}
	String outputCharSet="";
	String outputdupCharSet="";
	for(Character c:charSet) {
		outputCharSet=outputCharSet+c;
	}
	for(Character c:dupcharSet) {
		outputdupCharSet=outputdupCharSet+c;
	}
	System.out.println("charSet:"+" "+outputCharSet);
	System.out.println("dupcharSet:"+" "+outputdupCharSet);
}
}
