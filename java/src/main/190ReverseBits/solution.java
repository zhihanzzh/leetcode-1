public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int tmp = 0 ; 
        for(int i =0; i < 32; i ++){
            tmp = tmp <<1;
            tmp |= (n & 1);
            n >>= 1;
        }
        return tmp;
    }
}
