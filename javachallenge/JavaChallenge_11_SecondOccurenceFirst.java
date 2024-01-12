package javachallenge;

import java.util.LinkedHashSet;
import java.util.Set;

public class JavaChallenge_11_SecondOccurenceFirst {

	public static void main(String args[]) {
		String input="aabbacz";
		Set<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<input.length();i++) {
			if(set.contains(input.charAt(i))){
				System.out.println(input.charAt(i));
				break;
			}
			else {
				set.add(input.charAt(i));

			}
		}
	}
}
