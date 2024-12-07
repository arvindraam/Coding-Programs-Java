package arrayprogram;

public class MissingIntegerInArray {

	static void findMissingInteger(int arr[], int n, int arl) {
		int i, j;
		for(i=1; i<=n; i++) {
			for(j=0; j<arl; j++) {
				if(arr[j] == i) {
					break;
				}
				if(arl == j+1) {
					System.out.println(i);
				}
			}
		}
	}

	public static void main(String args[]) {
		int arr[] = {1,2,3,5};
		int n=5;
		int arl = arr.length;
		findMissingInteger(arr, n, arl);
	}
}
