public class CountPrimes {

    public int countPrimes(int n) {

        if (n <= 2)
            return 0;

        boolean[] isPrime = new boolean[n];
        int count = n - 2;
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= isPrime.length; i++) {
            if (isPrime[i] == true) {

                for (int j = i + i; j < isPrime.length; j += i) {
                    if (isPrime[j] == false) {
                        continue;
                    } else {
                        isPrime[j] = false;
                        count--;
                    }
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {

    }
}
