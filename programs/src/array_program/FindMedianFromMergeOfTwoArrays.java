package array_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindMedianFromMergeOfTwoArrays {

    public static void main(String[] ar) {

        int a[] = {10, 20, 30};
        int b[] = {40, 50, 60, 70, 80};

        // determines length of both arrays
        int a1 = a.length;
        int b1 = b.length;
        // resultant array size
        int c1 = a1 + b1;
        // create the resultant array
        int[] c = new int[c1];
        // using the pre-defined function arraycopy
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
        System.out.println(Arrays.toString(c));
        // output : [10, 20, 30, 40, 50, 60, 70, 80]

        int[] r1 = mergeArraysUsingArrayList(a, b);
        System.out.println(Arrays.toString(r1));
        // output : [10, 20, 30, 40, 50, 60, 70, 80]

        // Merging arrays using Java Streams
        int[] k = mergeArraysUsingStreams(a, b);
        System.out.println(Arrays.toString(k));
        // output : [10, 20, 30, 40, 50, 60, 70, 80]

        findMedianFromTwoArrays(a, b);

    }

    private static void findMedianFromTwoArrays(int[] a, int[] b) {
        // Create an ArrayList to store the merged
        // elements
        List<Integer> arrayList = new ArrayList<>();

        // Iterate through a and add each element to
        // resultList
        for (int n : a) {
            arrayList.add(n);
        }

        // Iterate through b and add each element to
        // resultList
        for (int n : b) {
            arrayList.add(n);
        }

        float median = (float) arrayList.stream().mapToInt(n -> n).sum() / arrayList.size();
        System.out.println(median);
        // output :

    }

    public static int[] mergeArraysUsingStreams(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
    }

    public static int[] mergeArraysUsingArrayList(int[] a, int[] b) {

        // Create an ArrayList to store the merged
        // elements
        List<Integer> r = new ArrayList<>();

        // Iterate through a and add each element to
        // resultList
        for (int n : a) {
            r.add(n);
        }

        // Iterate through b and add each element to
        // resultList
        for (int n : b) {
            r.add(n);
        }

        // Convert the ArrayList to an array using
        // streams
        return r.stream().mapToInt(Integer::intValue).toArray();
    }

}
