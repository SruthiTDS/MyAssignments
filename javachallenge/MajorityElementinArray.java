package javachallenge;

public class MajorityElementinArray {
	public static void main(String[] args) {
		int arr[]= {3,2,2,3};
		int maxCount = 0;
		int index = -1;
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				index = i;
			}
		}
		if (maxCount > arr.length / 2) {
			System.out.println(arr[index]);}

		else {
			System.out.println("No Majority Element");}
	}
}
