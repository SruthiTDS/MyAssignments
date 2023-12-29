package week3.day1;

public class LoginPage extends BasePage{
	@Override
	public void performCommonTasks(){
		System.out.println("Override BasePage class-->PerfromCommonTask-->LoginPage");
	}
	public static void main(String[] args) {
		LoginPage l=new LoginPage();
		l.clickElement();
		l.performCommonTasks();
		l.findElement();
		BasePage b=new BasePage();
		b.performCommonTasks();
	}
}
