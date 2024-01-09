package javachallenge;

public class JavaChallenge_9_FindFirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String str="leetcode";
		char charArray[]=str.toCharArray();
		
		int c = 0;
		boolean flag=false;
		for(int i=0;i<charArray.length;i++) {
			int count=0;
			for(int j=0;j<charArray.length;j++) {
				if(charArray[i]==charArray[j]) {
					count++;	
				}
			}
			
			if(count==1) {
				flag=true;
				c=i;
				break;
				
			}
			
		}
		if(flag) {
			System.out.println(c);
		}
		else {
			System.out.println("-1");
		}

	}

}
