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
		//This shows 
		Overriding o=new Overriding();
		o.reportStep("Message", "Status");
		//Restricts scope it will show only methods which are overriden i twont show
		//overriding class methods
		Overloading o1=new Overriding();
		o.test();
		o1.reportStep("p", "p");
		o1.reportStep("p1", "p1", false);
		
		o1.reportStep(null, null);
		o1.test();
		
		Overloading p=new Overloading();
		p.test();
		
	}
	

}
