package test_program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class testThree {

    public static void main(String[] arr) {
        List<Integer> a = Arrays.asList(5,3,2,8,5,6,6);
        //a.forEach(System.out::println);

        for(int i=0; i<a.size();i++){
            System.out.println(a.get(i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Thread b = new Thread();
        b.start();

        a=a.stream().distinct().sorted().collect(Collectors.toList());

        // System.out.println(a);
    }
}
