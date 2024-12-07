public class RepeatString {

    public static void main(String[] arg){
        String a = "geeksforgeeks";
        char[] c = a.toCharArray();
        int len = c.length;
        for(int i =0; i<len; i++){
            char com = c[i];
            boolean repeatFound = false;
            for(int j=i+1; j<len; j++) {
                if(com == c[j]){
                    repeatFound = true;
                    break;
                }
            }
            if(!repeatFound) {
                System.out.println(com);
break;
            }
        }

        for(int i=0; i<len; i++) {
            if(i==2){
                break;
            }
        }
    }
}
