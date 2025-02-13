package stream_api_program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharacterInStringsUsingStreams {

    public static void main(String[] args) {
        List<String> stringArrays = Arrays.asList("hello", "aravind", "Howw", "are", "you");

        // Combine all strings into a single stream of characters
        String combinedStrings = String.join("", stringArrays);

        Map<Character, Long> charCountMap = combinedStrings.chars()
                .mapToObj(c -> (char) c) // Convert int stream to char stream
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // Find and print duplicate characters
        System.out.println("Duplicate characters:");
        charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Filter characters with count > 1
                .forEach(entry -> System.out.println(entry.getKey() + " appears " + entry.getValue() + " times."));
        // output :
        // Duplicate characters:
        // a appears 3 times.
        // e appears 2 times.
        // l appears 2 times.
        // o appears 3 times.
        // r appears 2 times.
        // w appears 2 times.
    }

}
