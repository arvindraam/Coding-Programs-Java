package sort_program;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int arr[] = {5, 4, 2, 1, 3};
        bs.bubbleSort(arr);

        int array[] = {2, 1, 4, 3, 8, 6, 5};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        // output : [1, 2, 3, 4, 5, 6, 8]

    }

    public void bubbleSort(int[] arr) {
        int arl = arr.length;

        for (int i = 0; i < arl - 1; i++) {
            for (int j = 0; j < arl - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int k = 0; k < arl; k++) {
            System.out.print(arr[k] + " ");
            // output : 1 2 3 4 5
        }

        System.out.println();
        // output :  -- space
    }

}
