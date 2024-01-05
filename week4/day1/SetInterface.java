package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {
	public static void main(String[] args) {
		String companyName="google";
		char ch[]=companyName.toCharArray();
		
		Set<Character> str=new LinkedHashSet<Character>();
		Set<Character> unique=new LinkedHashSet<Character>();
		for(char c:ch) {
			str.add(c);
			
		}
		System.out.println(str);
		for(int i=0;i<ch.length;i++) {
			unique.add(ch[i]);
		}
		System.out.println(unique);
		String output="";
		for(Character c:unique) {
			output=output+c;
		}
		System.out.println(output);
		
	}

}
