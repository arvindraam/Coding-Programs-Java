package string_program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintDuplicateCharactersInStrings {

    public static void main(String[] args) {
        List<String> stringArrays = Arrays.asList("hello", "aravind", "Howw", "are", "you");

        Map<Character, Integer> charCountOneMap = new HashMap<>();

        // first method of solving
        //for (int i = 0; i < stringArrays.size(); i++){}
        for (String s : stringArrays) {
            for (char c : s.toCharArray()) {
                if (charCountOneMap.containsKey(c)) {
                    charCountOneMap.put(c, charCountOneMap.get(c) + 1);
                } else {
                    charCountOneMap.put(c, 1);
                }
            }
        }
        for (Character a : charCountOneMap.keySet()) {
            if (charCountOneMap.get(a) > 1) {
                System.out.println(a + " " + charCountOneMap.get(a));
                // output :
                // a 3
                // e 2
                // l 2
                // o 3
                // r 2
                // w 2
            }
        }

        // second method of solving
        StringBuilder combinedStrings = new StringBuilder();
        for (String s : stringArrays) {
            combinedStrings.append(s);
        }
        String allCharacters = combinedStrings.toString();
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : allCharacters.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print characters with count > 1
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
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

    }

}
