package logic_program;

public class PrimeNumberProgram {

    public static void main(String[] args) {
        int n = 11;
        if (isPrime(n))
            System.out.println(n + " is a prime number");
            // output : 11  is a prime number
        else
            System.out.println(" is not a prime number");

        int N = 100;
        //check for every number from 1 to N
        for (int i = 1; i <= N; i++) {
            //check if current number is prime
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                // output :
                // 2 is a prime number
                // 3 is a prime number
                // 5 is a prime number
                // 7 is a prime number
                //  .....
            }
        }
    }

    // Time complexity: O(N)
    // Auxiliary Space / Space complexity: O(1)
    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n/2
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}
