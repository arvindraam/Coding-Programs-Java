package test_program;

import java.util.HashMap;

public class Panagram {

    public static void main(String[] ar){
        String a = "The quick brown fox jumps over the lazy dog";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char b : a.toCharArray() ) {
            map.put(b,1);

        }
    }

}
