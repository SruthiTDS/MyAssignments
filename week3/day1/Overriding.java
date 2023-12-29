package week3.day1;

public class Overriding extends Overloading{
	public void reportStep(String msg,String status) {
		System.out.println("Override from Overload Class: "+ msg+" "+status);
	}
	public void p() {
		System.out.println(" g");
	}
	public static void main(String[] args) {
		//practice more on these scopes
		Overriding o=new Overriding();
		o.reportStep("Message", "Status");
		Overloading o1=new Overriding();
		o.test();
		Overloading p=new Overloading();
		p.test();
		p.reportStep(null, null);
		p.reportStep(null, null, false);
		o1.reportStep(null, null);
		o1.test();
		
		
		
	}
	

}
