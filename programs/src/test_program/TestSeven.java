package test_program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestSeven {

    public static void main(String[] ar){

        String duplicate = "google";

        HashMap<Character, Integer> map = new HashMap<>();

        List<Character> c = new ArrayList<>();
        for(char s : duplicate.toCharArray()){
            c.add(s);


        }

           c.stream().distinct();

    }
}
