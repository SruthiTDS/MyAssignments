package week3.day2;

public abstract class CanaraBank implements Payments {
	
	public void cashOnDelivery() {
		System.out.println("Cash On Delivery accepted-->Canara");
	}
	public void recordPaymentDetails() {
		System.out.println("Record payment details");
	}
}
