package week1.day2;

public class Browser {

	String launchBrowser(String browserName){
		System.out.println("Browser launched successfully");
		return browserName;
	}
	void loadUrl(){
		System.out.println("Application url loaded successfully");
	}
	
		 
	 
	public static void main(String[] args) {

	Browser b=new Browser();
	//Shortcut for assigning to local variable is ctrl+2
	String launchBrowser = b.launchBrowser("Firefox");
	
	System.out.println(launchBrowser);
	b.loadUrl();

	}

}
