package week3.day2;

public class ReverseOddWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		
		String input[]=test.split(" ");
		String result="";
		for(int i=0;i<input.length;i++) {
			if(i%2==1) {
				char charArray[]=input[i].toCharArray();
				String re="";
				for(int j=charArray.length-1;j>=0;j--) {
					re=re+Character.toString(charArray[j]);
				}
				result=result+re+" ";
			}
			else {
				result=result+input[i]+" ";
			}
			
		}
		System.out.println(result);
		
	}

}
