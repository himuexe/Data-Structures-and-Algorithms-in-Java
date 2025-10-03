package Basics.Easy;

public class BinaryToDecimal {
    public int binaryToDecimal(String b) {
        return Integer.parseInt(b, 2);
    }

    public int binaryToDecimal(int n) {
        int pow = 0, decimalNum = 0;
        while (n != 0) {
            decimalNum += (int) Math.pow(2, pow) * (n % 10);
            n /= 10;
            pow++;
        }
        return decimalNum;
    }
}