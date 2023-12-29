package week3.day2;

public class ReverseString {
	public static void main(String[] args) {
		String str="TestLeaf";
		String rev="";
		char arr[]=str.toCharArray();
		
		for(int i=arr.length;i>=0;i--) {
			System.out.println(arr[i]);
		}
			//or
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
	}

}
