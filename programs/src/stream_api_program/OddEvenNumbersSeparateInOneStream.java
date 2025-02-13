package stream_api_program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEvenNumbersSeparateInOneStream {

    // Collectors.partitioningBy explanation
    // public static <T> Collector<T,?,Map<Boolean,List<T>>> partitioningBy(Predicate<? super T> predicate)
    // Returns a Collector which partitions the input elements according to a Predicate, and organizes them into a Map<Boolean, List<T>>. There are no guarantees on the type, mutability, serializability, or thread-safety of the Map returned.
    // Type Parameters:
    // T - the type of the input elements
    // Parameters:
    // predicate - a predicate used for classifying input elements
    // Returns:
    // a Collector implementing the partitioning operation

    public static void main(String[] args) {
        int[] arr = {7, 24, 1, 19};

        // List<Integer> arrListOne = Arrays.stream(arr).boxed().collect(Collectors.toList());

        // In Java 16 and later
        List<Integer> arrList = Arrays.stream(arr).boxed().toList();

        Map<Boolean, List<Integer>> response = arrList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(response.entrySet());
        // output : [false=[7, 1, 19], true=[24]]

        List<Integer> evens = response.get(true);
        List<Integer> odds = response.get(false);

        System.out.println(evens);
        // output : [24]
        System.out.println(odds);
        // output : [7, 1, 19]

        Map<Boolean, List<Integer>> responses = arrList.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? Boolean.TRUE : Boolean.FALSE));

        System.out.println(responses.entrySet());
        // output : [false=[7, 1, 19], true=[24]]
    }

}
