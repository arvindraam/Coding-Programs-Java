package stream_api_program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumberUsingStreams {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(5, 5, 6, 6, 1, 10, 8);
        numberList = numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(numberList);
        // output : [6, 6, 10, 8]
    }

}
