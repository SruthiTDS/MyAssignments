package javachallenge;

public class JavaChallenge_3_PalindromePhrase {
	public static void main(String[] args) {
		String s="A man,a plan,a canal:Panama";
		String lowerCase=s.toLowerCase();
		String r=lowerCase.replaceAll("[^a-zA-Z0-9]","");
		String rev="";
		
		for(int i=r.length()-1;i>=0;i--) {
		rev=rev+r.charAt(i);
		}
		
		System.out.print(rev);
		System.out.println(" ");
		if(r.equals(rev)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		char charArray[]=r.toCharArray();
		String re="";
		for(int j=charArray.length-1;j>=0;j--) {
			re=re+Character.toString(charArray[j]);
		}
		System.out.println(re);
		if(r.equals(re)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
