package week1.day2;



public class FibonacciSeries {
	
	
	public static void main(String[] args) {
		int range=8,firstNum=0,secondNum=1,sum=0;
		 System.out.print(firstNum+" "+secondNum);
		for (int i = 2; i < range; i++) {
			
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			System.out.print(" "+sum);
		}
	}

}



