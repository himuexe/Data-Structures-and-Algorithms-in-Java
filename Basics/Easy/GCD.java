class Solution {
    public static int gcd(int a, int b) {
        // code here
        if(a==0)return b;
        return gcd(b%a,a);
    }
    public static int lcm(int a, int b){
        return (a*b)/gcd(a, b);
    }
}
