public class FibonacciDP {

    /*
     * calculate the nth Fibonacci number using dynamic programming
     */
    public static int fib(int n) {

        int[] fib = new int[n + 2];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            // Calculate and store the solution to the subproblem
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at the position " + n + ": " + fib(n));
    }

}
