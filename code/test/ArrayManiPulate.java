import java.util.Arrays;

public class ArrayManiPulate {

    public static void main(String[] args){
       int[] arr = new int[]{2,3,6,4,3,9,8,6, 10};
       Arrays.sort(arr);
        int[] arrr = Arrays.stream(arr).distinct().toArray();
        int n=5;
        int len = arrr.length;
        int count = 0;
        int max = 0;
        for (int i=0;i<len;i++) {
            if(arrr[i]>n){
                count++;
            }
            if(arrr[i]>n && count !=1 && max<2){
                System.out.println(arrr[i]);
                max++;
            }
        }

    }

}
