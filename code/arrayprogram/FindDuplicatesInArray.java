package arrayprogram;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInArray {
	
	public static void main(String args[]) {
		int arr[] = {2, 3, 2};
		findDuplicates(arr);
	}

	// Time Complexity O(N)  Space Complexity O(N)
	private static void findDuplicates(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		System.out.println(map.entrySet());
	}

}