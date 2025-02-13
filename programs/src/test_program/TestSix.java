package test_program;

import java.util.*;
import java.util.stream.Collectors;

public class TestSix {


    public static void main(String[] ar){


        int[] arr = {1,3,3,2,6,8,12} ;


        List<Integer> array = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Optional<Integer> secondLargest = array.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst();
        secondLargest.ifPresent(System.out::println);


  /*      int target = 13;

        int len = arr.length;
        int k=0;

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(arr[i]+arr[j] == target){
                    System.out.println(arr[i] + " " + arr[j]);
                    k=1;
                    break;
                }
            }
            if(k==1){
                break;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int l=0;l<len;l++){
            map.put(l, arr[l]);
        }

        map.entrySet().
*/
    }
}
