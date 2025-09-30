// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        if(n<0)return false;
        int digits = (int)Math.log10(n)+1;
        int num =n;
        int sum=0;
        while(num!=0){
            sum += Math.pow(num%10,digits);
            num /=10;
        }
        return sum==n;
    }
}