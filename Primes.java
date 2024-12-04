public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);  // Parse the upper limit for prime search
        boolean[] isPrime = new boolean[n + 1];  // Array to store prime status

        // Initially, assume all numbers from 2 to n are prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Replace the following statement with your code:
        sieveOfEratosthenes(isPrime, n);

        // Print prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }

        // Calculate and print the percentage of primes
        int primeCount = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primeCount++;
            }
        }
        double percentage = (primeCount / (double) (n - 1)) * 100;
        System.out.printf("There are %d primes between 2 and %d (%.0f%% are primes)\n", primeCount, n, percentage);
    }

    /**
     * Implements the Sieve of Eratosthenes algorithm to find all primes up to n.
     */
    public static void sieveOfEratosthenes(boolean[] isPrime, int n) {
        // Replace the following statement with your code:
        int p = 2;
        while (p * p <= n) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
            p++;
        }
    }
}
