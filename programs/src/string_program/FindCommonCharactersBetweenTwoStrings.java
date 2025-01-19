package string_program;

import java.util.HashSet;

public class FindCommonCharactersBetweenTwoStrings {

    public static void main(String[] args) {
        String s1 = "mihir";
        String s2 = "ravi";

        // Convert the strings to lowercase (optional) to ignore case sensitivity
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        HashSet<Character> setOne = new HashSet<>();
        HashSet<Character> commonSet = new HashSet<>();

        for(char c : s1.toCharArray()) {
            setOne.add(c);
        }

        for(char c : s2.toCharArray()) {
            if(setOne.contains(c)){
                commonSet.add(c);
            }
        }

        // Print the common characters
        System.out.println("Common characters: " + commonSet);

    }

}
