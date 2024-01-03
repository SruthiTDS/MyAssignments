package week1.day1;

public class Mobile {
	
	void makeCall(String mobileModel,float mobileWeight) {
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
		
	}
	
	void sendMsg(boolean isFullCharged,int mobileCost){
		System.out.println(isFullCharged+" "+mobileCost);
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.makeCall("iPhone", 250.6f);
		m.sendMsg(true, 57000);
		System.out.println("This is my mobile");
		
	}

}
