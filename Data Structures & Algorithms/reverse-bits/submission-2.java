class Solution {
    public int reverseBits(int n) {
        long rev = 0;
        long num = Integer.toUnsignedLong(n);
        for(int i = 0; i < 32; i++) {
            int rem = (int)num % 2;
            rev = rev * 2 + rem;
            num /= 2;
        }
        return (int)rev;
    }
}
