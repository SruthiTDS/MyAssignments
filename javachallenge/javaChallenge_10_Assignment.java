package javachallenge;

public class javaChallenge_10_Assignment {
	public static void main(String args[]) {
		String jewels="a";
		String stones="aAAbbb";
		boolean flag=false;
		int count=0;
		
		char charArray[]=jewels.toCharArray();
		char charArray1[]=stones.toCharArray();
	
		
		for(int i=0;i<charArray.length;i++) {
			
			for(int j=0;j<charArray1.length;j++) {
				if(charArray[i]==charArray1[j]) {
					count++;
					
				}
			}
			if(count>=1) {
				flag=true;
			}
		}
		
		if(flag) {
			
			System.out.println("No of stones found:" + " "+count);
		}
		else {
			System.out.println("Not found any:"+" "+ "-1");
		}
		
	}

}
