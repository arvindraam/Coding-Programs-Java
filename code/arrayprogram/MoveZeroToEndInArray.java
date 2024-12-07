package arrayprogram;

public class MoveZeroToEndInArray {
	
	static void moveZero(int arr[], int n) {
		int count = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		
		while(count < n) {
			arr[count++] = 0;
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {2, 5, 0, 6, 8, 0, 7, 0};
		int n = arr.length;
		moveZero(arr, n);
		System.out.println();
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
