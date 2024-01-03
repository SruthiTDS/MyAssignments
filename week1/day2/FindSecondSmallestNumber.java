package week1.day2;


public class FindSecondSmallestNumber {
	public static void main(String[] args) {
		
		
		
		int arr[]={23,45,67,32,89,22 };
		
		/*Arrays.sort(arr);
		System.out.println("Second Smallest "+""+arr[1]);*/
		
		int smallest=arr[0];

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					smallest=arr[j];
					arr[j]=arr[i];
					arr[i]=smallest;
				}

			}

		}
		

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Second smallest number is:"+ "" +arr[1]);
		
		
		

	}


}
