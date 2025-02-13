package array_program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class LargestNumberInArrayForGivenNthNumber {

    // Input: nums = [3,2,1,5,6,4], k = 2 Output: 5
    // Input: nums = [3,2,3,1,2,4,5,5,6], k = 4 Output: 3
    public static void main(String[] ar) {
        List<Integer> numbers = Arrays.asList(3, 2, 3, 1, 2, 4, 5, 5, 6);
        int placeOfLargestNumber = 4;

        Optional<Integer> largestNumberOptional =
                numbers.stream().distinct().sorted(Collections.reverseOrder()).skip(placeOfLargestNumber - 1).findFirst();
        largestNumberOptional.ifPresent(System.out::println);
        // output : 3
    }

}
