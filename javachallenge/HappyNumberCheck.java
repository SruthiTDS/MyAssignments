package javachallenge;

public class HappyNumberCheck {
	public static void main(String[] args) {
		int num=19;
		int temp=num;
		int sum=0;


		while(temp>1) {
			while(temp>0) {
				int r = temp%10;
				sum=sum+(r*r);
				temp=temp/10;
			}
			temp=sum;
			sum=0;
		}
		if(temp==1) {
			System.out.println("Happy Number");
		}
		else {
			System.out.println("not Happy Number");
		}

	}
}
