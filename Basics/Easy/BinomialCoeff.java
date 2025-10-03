package Basics.Easy;

public class BinomialCoeff {
    public int nCr(int n, int r) {
        return fact(n)/(fact(r)*fact(n-r));
    }
    public int fact(int num){
        int fact=1;
        for(int i=1;i<=num;i++) fact *= i;
        return fact;
    }

}