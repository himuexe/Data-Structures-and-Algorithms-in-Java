package Basics.Medium;

public class Power {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long exp = n;
        if (exp < 0)
            exp *= -1;
        while (exp != 0) {
            if (exp % 2 == 0) {
                exp /= 2;
                x *= x;
            } else {
                ans *= x;
                exp--;
            }
        }
        if (n < 0) {
            return (double) 1.0 / (double) ans;
        }
        return ans;
    }
}