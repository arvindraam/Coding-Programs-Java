package stream_api_program;

import java.util.*;

public class FindSecondLargestNumberInListUsingStreams {

    public static void main(String[] arr) {
        List<Integer> numberList = Arrays.asList(5, 5, 6, 6, 1, 10, 8);
        Optional<Integer> secondLargestNumber = numberList.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst();
        // Optional<Integer> secondLargestNumber = numberList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        // .distinct() // Remove duplicates
        // .sorted((a, b) -> b - a) // Sort in descending order
        // .sorted(Collections.reverseOrder()) // Sort in descending order
        // .sorted(Comparator.reverseOrder()) // Sort in descending order
        // .skip(1) // Skip the first (largest) element
        // .findFirst(); // Get the second largest element

        if (secondLargestNumber.isPresent()) {
            System.out.println("Second Largest Number : " + secondLargestNumber.get());
            // output : Second Largest Number : 8
        } else {
            System.out.println("No second largest number element found.");
        }

    }

}
