package javachallenge;

public class PalindromePhrase {
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
		
	}

}
