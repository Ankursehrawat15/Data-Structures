public class FibonnaciNumber {
    // time complexity is very bad as we are doing repetitve work
    // will optimize this after doing DP
    public int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int ans = fib(n - 2) + fib(n - 1);

        return ans;

    }
}
