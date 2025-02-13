package stream_api_program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOddNumbersDoubleItUsingStreams {

    public static void main(String[] args) {
        int[] arr = {7, 24, 1, 19};

        List<Integer> arrList = Arrays.stream(arr).boxed().toList().stream().filter(n -> n % 2 != 0).sorted().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(arrList);
        // output : [2, 14, 38]


        List<Integer> arrListOne = Arrays.asList(3, 4, 5, 6);
        arrListOne = arrListOne.stream().filter(n -> n % 2 != 0).sorted().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(arrListOne);
        // output : [6, 10]
    }

}
