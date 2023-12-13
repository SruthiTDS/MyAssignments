package week1.day2;

public class ConvertNegativeNumberToPositive {
	public static void main(String[] args) {
		int num=-40;
		if(num<0) {
			int convertNumber= ~(num)+1;
			System.out.println("The number -40 is converted to"+" "+ convertNumber);
		}
		
		int a=40;
		System.out.println(~a);
		int b=-35;
		System.out.println(~b);
		
		if(num<0) {
			int convertedInto=num*(-1);
			System.out.println("Converted into:"+""+convertedInto);
		}

	}
}
