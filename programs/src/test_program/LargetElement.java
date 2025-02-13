package test_program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class LargetElement {

    //Input: nums = [3,2,1,5,6,4], k = 2 Output: 5
    //Input: nums = [3,2,3,1,2,4,5,5,6], k = 4 Output: 3
    public static void main(String[] ar) {

        List<Integer> nums = Arrays.asList(3,2,3,1,2,4,5,5,6);

        Optional<Integer> ops = nums.stream().distinct().sorted(Collections.reverseOrder()).skip(4-1).findFirst();
        ops.ifPresent(System.out::println);
    }
}
