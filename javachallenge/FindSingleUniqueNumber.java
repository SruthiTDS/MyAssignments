package javachallenge;

public class FindSingleUniqueNumber {
	public static void main(String[] args) {
		int arr[]= {4,1,2,1,2,4,6,5,5};
		int singleNumber = 0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			int count=0;

			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}

			}
			if(count==1) {
				flag=true;
				singleNumber=arr[i];
			}
			

		}
		if(!flag) {
			System.out.println("No unique number is present");
		}
		else {
			System.out.println("Unique Number is:"+""+singleNumber);
		}
		

	}




}


