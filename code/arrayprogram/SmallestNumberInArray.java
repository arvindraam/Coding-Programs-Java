package arrayprogram;

public class SmallestNumberInArray {
	
	public static void main(String args[]) {
		SmallestNumberInArray sn = new SmallestNumberInArray();
		int arr[] = {3, 4, 5, 6, 2};
		sn.findSmallestNumber(arr);
	}
	
	// Time Complexity O(N)  Space Complexity O(1)
	public void findSmallestNumber(int arr[]) {
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(min);
	}

}
