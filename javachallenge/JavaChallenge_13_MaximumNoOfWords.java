package javachallenge;

public class JavaChallenge_13_MaximumNoOfWords {
	public static void main(String args[]) {
		String str[]= {"alice and bob love leetcode","i think so too","this is great thanks very much"};
		
		int wordsLength=0;
		
		int maxWordsLength=str[0].split(" ").length;
		
		for(int i=0;i<str.length;i++) {
			
				if(str[i]!="") {
					wordsLength=str[i].split(" ").length;
					
					if(maxWordsLength<wordsLength) {
						maxWordsLength=wordsLength;
					}
						
				}
			
		}
		System.out.println(maxWordsLength);
		
	}

}
