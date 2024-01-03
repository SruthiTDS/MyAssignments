package week3.day2;



public class RemoveDuplicateWordsAnotherApproach {
	public static void main(String[] args) {
		String input="We learn Java basics as part of java sessions in java week1";
		String str[]=input.split(" ");

		String result="";
		int count = 0;
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if((str[i].toLowerCase()).equals(str[j].toLowerCase())) {
					count++;
					str[j]=" ";
					result=result+str[j]+" ";
				}
				
			}
			
			result=result+str[i]+" ";
		}
		System.out.println(count);
		System.out.println(result);
	}

}
