package logic_program;

public class FibonacciProgram {

    static int m1 = 0, m2 = 1, m3;

    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2);
        // output : 0 1
        int n = 10;
        fibonacciSeries(n, n1, n2);
        System.out.println();
        System.out.print(m1 + " " + m2);
        // output : 0 1
        int count = 10;
        fibonacciSeriesRecursively(count - 2);
    }

    private static void fibonacciSeries(int n, int n1, int n2) {
        int n3;
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            // output : 1 2 3 5 8 13 21 34
            // full output : 0 1 1 2 3 5 8 13 21 34
        }
    }

    private static void fibonacciSeriesRecursively(int count) {
        if (count > 0) {
            m3 = m1 + m2;
            m1 = m2;
            m2 = m3;
            System.out.print(" " + m3);
            // output : 1 2 3 5 8 13 21 34
            // full output : 0 1 1 2 3 5 8 13 21 34
            fibonacciSeriesRecursively(count - 1);
        }
    }

}
