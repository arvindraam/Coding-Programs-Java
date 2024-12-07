package test;

import java.util.HashMap;

public class Testone {
	
	public static void main(String ar[]) {
		int arr[] = {4, 7, 1, 6, 3, 4, 7, 1, 1};
		countNum(arr);
	}
	
	static void countNum(int ar[]) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int len = ar.length;
		for(int i=0; i<len; i++) {
			if(!hm.containsKey(ar[i])) {
				hm.put(ar[i], 1);
			}else {
				hm.put(ar[i], hm.get(ar[i])+1);
			}
		}
		
		System.out.println(hm.entrySet());
	}
	

}

//Input:
/*
 * array --> 4, 7, 1, 6, 3, 4, 7, 1, 1 Output: 4 : 2 7 : 2 1 : 3 6 : 1 3 : 1
 */
