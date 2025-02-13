package string_program;

public class ReverseString {

    public static void main(String args[]) {
        String input = "main";

        // One way to solve using internal methods
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        System.out.println(sb);
        // output : niam

        // Another way to solve
        char[] inputType = input.toCharArray();
        for(int i = inputType.length-1; i >= 0; i--) {
            System.out.print(inputType[i]);
            // output : niam
        }
    }

}
