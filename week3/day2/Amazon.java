package week3.day2;

public class Amazon extends CanaraBank{
	public void cashOnDelivery() {
		System.out.println("Cash On Delivery accepted-->amazon");
	}
	public void upiPayments() {
		System.out.println("UPI accepted");
	}
	public void cardPayments() {
		System.out.println("Credit cards accepted");
	}
	public void internetBanking() {
		System.out.println("Net Banking accepted");
	}
	public static void main(String[] args) {
		Amazon a=new Amazon();
		a.cardPayments();
		a.cashOnDelivery();
		a.recordPaymentDetails();
		a.internetBanking();
		a.upiPayments();
	}
}
