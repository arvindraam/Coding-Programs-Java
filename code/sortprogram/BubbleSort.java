package sortprogram;

public class BubbleSort {
	
	public static void main(String args[]) {
		BubbleSort bs = new BubbleSort();
		int arr[] = {5, 4, 2, 1, 3};
		bs.bubbleSort(arr);
	}

	public void bubbleSort(int[] arr) {
		
		int arl = arr.length;
		
		for(int i = 0; i < arl-1; i++) {
			for(int j = 0; j < arl-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int k = 0; k < arl; k++) {
			System.out.print(arr[k] + " ");
		}
		
		System.out.println();
		
	}


}


