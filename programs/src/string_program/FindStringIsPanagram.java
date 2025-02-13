package string_program;

public class FindStringIsPanagram {

    // A string is a panagram string if it contains all the character of the
    // alphabets ignoring the case of the alphabets.

    public static void main(String args[]) {
        // Given string str
        String str = "Abcdefghijklmnopqrstuvwxyz12";
        String strr = "The quick brown fox jumps over the lazy dog";

        // Function call - One way to solve
        allLetter(strr);

        // Function call - Another way to solve
        int len = str.length();
        if (allLetterCheck(str, len))
            System.out.println("Yes");
            // output : Yes
        else
            System.out.println("No");
    }

    // Function to check if a string
    // contains all the letters from
    // a to z (ignoring case)
    public static void allLetter(String str) {
        // Converting the given string
        // into lowercase
        str = str.toLowerCase();

        boolean allLetterPresent = true;

        // Loop over each character itself
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // Check if the string does not
            // contains all the letters
            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }

        // Check if all letter present then
        if (allLetterPresent)
            System.out.println("Given string is a panagram");
            // output : Given string is a panagram
        else
            System.out.println("Given string is not a panagram");
            // Given string is not a panagram
    }

    // Function to check if ch is a letter
    static boolean isLetter(char ch)
    {
        if (!Character.isLetter(ch))
            return false;

        return true;
    }

    static int size = 26;

    // Function to check if a string
    // contains all the letters from
    // a to z
    static boolean allLetterCheck(String str,
                             int len)
    {
        // Convert the given string
        // into lowercase
        str = str.toLowerCase();

        // Create a frequency array to
        // mark the present letters
        boolean[] present = new boolean[size];

        // Traverse for each character
        // of the string
        for (int i = 0; i < len; i++) {

            // If the current character
            // is a letter
            if (isLetter(str.charAt(i))) {

                // Mark current letter as present
                int letter = str.charAt(i) - 'a';
                present[letter] = true;
            }
        }

        // Traverse for every letter
        // from a to z
        for (int i = 0; i < size; i++) {

            // If the current character
            // is not present in string
            // then return false,
            // otherwise return true
            if (!present[i])
                return false;
        }
        return true;
    }

}
