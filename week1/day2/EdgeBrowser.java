package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser b=new Browser();
		String name=b.launchBrowser("Chrome");
		System.out.println(name);
		b.loadUrl();

	}

}
