package week3.day1;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("name");
	}
	
	public void enterPassword(){
		System.out.println("pwd");
	}
	public static void main(String[] args) {
		LoginTestData lt=new LoginTestData();
		lt.enterCredentials();
		lt.enterPassword();
		lt.enterUsername();
		lt.navigateToHomePage();
		
	}

}
