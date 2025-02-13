package array_program;

public class FindIndexOfTargetNumberInArray {

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 3, 5, 6};
        System.out.println("Output: " + binarySearchIndexToInsertNumber(nums1, 5));
        // output : Output: 2

        int[] nums2 = {1, 3, 5, 6};
        System.out.println("Output: " + binarySearchIndexToInsertNumber(nums2, 2));
        // output : Output: 1

        int[] nums3 = {1, 3, 5, 6};
        System.out.println("Output: " + binarySearchIndexToInsertNumber(nums3, 7));
        // output : Output: 4
    }

    // Time Complexity: O(log n)
    // The binary search reduces the search space by half in each iteration.
    // Space Complexity: O(1)
    // The algorithm uses a constant amount of extra space.
    public static int binarySearchIndexToInsertNumber(int[] arr, int number) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == number) {
                return mid;
            } else if (arr[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}
