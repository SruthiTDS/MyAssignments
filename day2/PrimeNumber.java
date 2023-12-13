package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input =17;
		boolean flag=false;
		for(int i=2;i<input/2;i++) {
			if(input%i==0) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
	}
}
