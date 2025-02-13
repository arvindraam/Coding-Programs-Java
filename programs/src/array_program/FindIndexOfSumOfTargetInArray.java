package array_program;

import java.util.HashMap;
import java.util.Map;

public class FindIndexOfSumOfTargetInArray {

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = indexOfSumOfTarget(nums1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");
        // output : Output: [0, 1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = indexOfSumOfTarget(nums2, target2);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");
        // output : Output: [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = indexOfSumOfTarget(nums3, target3);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
        // output : Output: [0, 1]
    }

    // Time Complexity : O(n)
    // Space Complexity: O(n)
    public static int[] indexOfSumOfTarget(int[] nums, int target) {
        // Create a HashMap to store the numbers and their indices
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            // Check if the complement is already in the map
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            // Store the current number and its index in the map
            seen.put(nums[i], i);
        }
        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No index found for target solution");
    }

}
