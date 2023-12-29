package week3.day1;

public class Safari extends Browser{
	public void readerMode() {
		System.out.println("readerMode--->Safari Class");
	}
	public void fullScreenMode() {
		System.out.println("full screen--->Safari class");
	}
	
	public static void main(String[] args) {
		Safari s=new Safari();
		System.out.println(s.browserName);
		System.out.println(s.browserVersion);
		s.readerMode();
		s.fullScreenMode();
		s.openURL();
		s.closeBrowser();
		s.navigateBack();
	}

}
