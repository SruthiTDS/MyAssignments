package week3.day1;

public class Elements extends Button{
	public static void main(String args[]) {
		
		//Extended Button and button extended WebELement able to call 
		//Methods from button and webelement
		Elements e=new Elements();
		e.click();
		e.setText("Sruthi");
		e.submit();
		
		//Radio button extended Button class
		RadioButton b=new RadioButton();
		b.selectRadioButton();
		b.submit();
		
		//TextField extended WebElement able to call webelement method as well
		TextField t=new TextField();
		t.getText();
		t.click();
		t.setText("Sruthi1");
		
		//CheckBox Button extended Button able to call Button methods
		CheckBoxButton ch=new CheckBoxButton();
		ch.clickCheckButton();
		ch.submit();
		
				
		
		
		

	}
}
