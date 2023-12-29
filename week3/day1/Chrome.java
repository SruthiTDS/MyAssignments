package week3.day1;

public class Chrome extends Browser{
	public void openIncognito(){
		System.out.println("Incongnito-->Chrome Class");
	}
	public void clearCache(){
		System.out.println("Cache cleared--->Chrome Class");
	}
	public void openURL(){
		System.out.println("URL launched--->Ovveride");
	}
	public static void main(String[] args) {
		Chrome c=new Chrome();
		Browser b=new Chrome();//restricting the scope here not able to access child properties and methods
		Browser b1=new Browser();//Same restricting scope
		System.out.println(Browser.a);
		b1.openURL();
		b1.closeBrowser();
		b.openURL();
		b.closeBrowser();
		
		System.out.println(c.browserName);
		System.out.println(c.browserVersion);
		c.openIncognito();
		c.clearCache();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
	}
	
}
