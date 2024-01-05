package javachallenge;

public class NumberAppearsTwice {
	public static void main(String[] args) {
		int arr[]= {4,2,1,2,6,5,5};
		boolean flag=false;
		
		int num=0;
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {

					count++;
				}

			}
			if(count>=2) {
				flag=true;
				num=arr[i];
				
				break;
			}

		}
		if(!flag) {
			System.out.println("Not repeated even once:"+" "+false);
		}
		else {
			System.out.println("repeated:"+" "+num+" "+true);
		}
	}

}
