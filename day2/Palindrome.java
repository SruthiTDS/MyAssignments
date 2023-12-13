package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int num=34343;
		int temp=num;
		int rev=0;
		while(num>0) {
			int r=num%10;
			num=num/10;
			
			rev=rev*10+r;
		}
		
		if(rev==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
