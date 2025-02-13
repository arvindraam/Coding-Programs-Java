package stream_api_program;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacterInStringUsingStreams {

    public static void main(String[] ar) {

        String stringValue = "google";
        Character firstNonRepeatedChar = logic(stringValue);
        System.out.println("The first non repeated character  is  :  " + firstNonRepeatedChar);
        // output : The first non repeated character is  :  l

    }

    private static Character logic(String input) {
        Character result = input.chars()    // IntStream
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a LinkedHashMap with the count
                .entrySet().stream()   // EntrySet stream
                .filter(entry -> entry.getValue() == 1L)   // extracts characters with a count of 1
                .map(entry -> entry.getKey())   // get the keys of EntrySet
                .findFirst().get();  // get the first entry from the keys
        return result;
    }

}
