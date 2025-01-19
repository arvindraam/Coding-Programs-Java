package array_program;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNumbersInArray {

    public static void main(String[] args) {
        int[] arr = {2, 3, 2};
        findDuplicateNumbers(arr);
    }

    // Time Complexity O(N) Space Complexity O(N)
    public static void findDuplicateNumbers(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        // normal for loop
        // for (int i = 0; i < arr.length; i++) {
        //    if(map.containsKey(arr[i])) {
        //        map.put(arr[i], map.get(arr[i])+1);
        //    } else {
        //        map.put(arr[i], 1);
        //    }
        // }
        for (int j : arr) {
            //    if(map.containsKey(j)) {
            //        map.put(j, map.get(j)+1);
            //    } else {
            //        map.put(j, 1);
            //    }
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        // enhanced for loop
        System.out.println(map.entrySet());

        // another for loop to print result
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println("Duplicate number found : " + key);
            }
        }
    }

}
