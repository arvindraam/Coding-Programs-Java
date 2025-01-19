package test_program;

import java.util.HashMap;
import java.util.Map;

public class testOne {



    public static void main(String ar[]) {
        int[] arr ={7,24,1,19};

        //List<Integer> a = Arrays.stream(arr).filter(n -> n%2 != 0).sorted().map(n->n*2).collect(Collectors.toList());
   //a.forEach(System.out::println);
        /*int len = arr.length;
        for(int i = len-1; i >= 0; i--){

        }*/
//19,1,24,7 index 3 index 2 index 1 index 0


        String s1 ="mihir";
        String s2 = "rav";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            }else{
                map.put(s1.charAt(i),1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if(map.containsKey(s2.charAt(i))){
                map.put(s2.charAt(i), map.get(s2.charAt(i))+1);
            }else{
                map.put(s2.charAt(i),1);
            }
        }
    }
}
