package week3.day1;

public class Edge extends Browser {
	public void takeSnap() {
		System.out.println("Snapshot --->Edge Class");
	}
	public void clearCookies() {
		System.out.println("Cookies cleared--->Edge Class");
	}
	public static void main(String[] args) {
		Edge e=new Edge();
		System.out.println(e.browserName);
		System.out.println(e.browserVersion);
		e.takeSnap();
		e.clearCookies();
		e.openURL();
		e.navigateBack();
		e.closeBrowser();
	}
}
