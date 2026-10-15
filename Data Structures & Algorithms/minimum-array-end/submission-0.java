
class Solution {
    public long minEnd(int n, int x) {
        long ans = x;
        long bits = n - 1;
        long pos = 1;
        while (bits > 0) {
            if ((ans & pos) == 0) {
                if ((bits & 1) == 1) {
                    ans |= pos;
                }
                bits >>= 1;
            }
            pos <<= 1;
        }
        return ans;
    }
}
