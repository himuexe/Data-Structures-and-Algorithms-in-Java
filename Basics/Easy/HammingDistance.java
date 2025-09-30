class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        int xor = x^y;
        for(int i=1;i<32;i++){
            if((xor&1)!=0) count++;
            xor >>= 1;
        }
        return count;
    }
}