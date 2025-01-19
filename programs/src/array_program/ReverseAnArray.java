package array_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {7, 24, 1, 19};
        int[] arrSort = {7, 24, 1, 19};

        // inbuilt or default methods
        // sorting purpose
        Arrays.sort(arrSort);
        System.out.println("Inbuilt arrays sort : " + Arrays.toString(arrSort));

        // reverse purpose
        // List<Integer> arrListOne = new ArrayList<>(Arrays.asList(1, 4, 3, 2, 6, 5));
        List<Integer> arrList = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        Collections.reverse(arrList);
        System.out.println("Inbuilt collections reverse : " + arrList);
        // sorting purpose
        Collections.sort(arrList);
        System.out.println("Inbuilt collections sort : " + arrList);

        reverseAnArrayWithoutUsingInBuiltMethods(arr);

        reverseAnArrayWithUsingRecursion(arr);
    }

    // Time Complexity O(N) Space Complexity O(1)
    public static void reverseAnArrayWithoutUsingInBuiltMethods(int[] array) {
        int len = array.length;

        for (int i = 0; i < len / 2; i++) {
            int temp = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = temp;
        }

        System.out.println("Reversed Array using for loop total length / 2 : " + Arrays.toString(array));
    }

    // Time Complexity O(N) Space Complexity O(N)
    public static void reverseAnArrayWithUsingRecursion(int[] array) {
        int len = array.length;
        reverseAnArrayRecursively(array, 0, len - 1);
        System.out.println("Reversed Array Recursively : " + Arrays.toString(array));
    }

    public static void reverseAnArrayRecursively(int[] array, int leftMostIndex, int rightMostIndex) {
        if (leftMostIndex >= rightMostIndex)
            return;

        int temp = array[leftMostIndex];
        array[leftMostIndex] = array[rightMostIndex];
        array[rightMostIndex] = temp;

        reverseAnArrayRecursively(array, leftMostIndex + 1, rightMostIndex - 1);
    }

}
