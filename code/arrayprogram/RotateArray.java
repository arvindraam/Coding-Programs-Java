package arrayprogram;

public class RotateArray {
	
	public void leftRotate(int arr[], int d, int n) {
		for(int i = 0; i < d; i++) {
			leftRotateByOne(arr, n);
		}
	}
	
	public void leftRotateByOne(int arr[], int n) {
		int temp, i;
		temp = arr[0];
		for(i = 0; i < n-1; i++) { 
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
				
	}
	
	public void printArray(int arr[], int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String args[]) {
		RotateArray rar = new RotateArray();
		int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7};
		rar.leftRotate(arr, 2, arr.length);
		rar.printArray(arr, arr.length);
	}

}

