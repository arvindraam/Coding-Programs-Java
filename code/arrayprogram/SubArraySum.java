package arrayprogram;

import java.util.Arrays;

public class SubArraySum {
	
	public static void main(String args[]) {
		SubArraySum sumSub = new SubArraySum();
		int arr[] = new int[] {15, 2, 4, 8, 9, 5, 10, 23};
		int n = arr.length;
		int sum = 23;
		//sumSub.findSubArray(arr, n, sum);
		sumSub.findSubArrayQuick(arr, n, sum);
	}
	
	// Time Complexity O(N^2)  Space Complexity O(1)
	int findSubArray(int arr[], int n, int sum) {
		
		int total, i, j;
		for(i = 0; i < n; i++) {
			total = arr[i];
			for(j = i + 1; j <= n; j++) {
				int p = j - 1;
				if(total == sum) {
					System.out.println(total);
					System.out.println(i + " " + p);
					System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, p+1)));
					return 1;
				}
				if(total > sum || j == n) {
					break;
				}
				total = total + arr[j];
			}
		}
		System.out.println("No Sub Array found");
		return 0;
	}
	
	// Time Complexity O(N)  Space Complexity O(1)
	int findSubArrayQuick(int arr[], int n, int sum) {
		
		int total = arr[0], start = 0, i;
		
		for(i = 1; i <= n; i++) {
			
			while(total > sum && start < i - 1) {
				total = total - arr[start];
				start++;
			}
			
			if(total == sum) {
				int p = i - 1;
				System.out.println(total);
				System.out.println(start + " " + p);
				System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, p+1)));
				return 1;
			}
			
			if(i < n) {
				total = total + arr[i];
			}
		}
		
		System.out.println("No Sub Array found");
		return 0;
	}	

}

