package week3.day2;

public class OddIndexToUpperCase {
	public static void main(String[] args) {
		String test = "changeme";
		char charArray[]=test.toCharArray();
		String str="";
		
		for(int i=0;i<charArray.length;i++) {
			if(i%2==1) {
				str=str+Character.toString(charArray[i]).toUpperCase();
			}
			else {
				str=str+Character.toString(charArray[i]);
			}
			
		}
		System.out.println(str);
		
	}

}
