package Basics.Easy;

public class PrimesInRange {
    public int[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++)
            isPrime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        int count = 0;
        for (int p = 2; p <= n; p++) {
            if (isPrime[p])
                count++;
        }

        int[] res = new int[count];
        int index = 0;
        for (int p = 2; p <= n; p++) {
            if (isPrime[p])
                res[index++] = p;
        }
        return res;
    }
}