package logic_program;

public class FactorialProgram {

    public static void main(String[] args) {
        FactorialProgram factorialProgram = new FactorialProgram();
        int number = 5;
        factorialProgram.calculateFactorial(number);
        int factorial = factorialProgram.calculateFactorialRecursively(number);
        System.out.println("Factorial of a number " + number + " is " + factorial);
        // output : Factorial of a number 5 is 120
    }

    void calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of a number " + number + " is " + factorial);
        // output : Factorial of a number 5 is 120
    }

    int calculateFactorialRecursively(int number) {
        if (number == 0) {
            return 1;
        }
        return number * calculateFactorialRecursively(number - 1);
    }

}
