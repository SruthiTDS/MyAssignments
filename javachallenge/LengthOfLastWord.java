package javachallenge;

public class LengthOfLastWord {
	public static void main(String[] args) {
		//Program to return last word length
		String input="luffy is still joyboy";
		String word[]=input.split(" ");
		int lastWordLength=word[word.length-1].length();
		System.out.println(lastWordLength);
		
		
	}
}
