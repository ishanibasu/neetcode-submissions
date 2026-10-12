class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 0;
        for(int i : piles){
            r = Math.max(r, i);
        }
        while(l < r){
            int m = (l + r) / 2;
            int hrs = 0;
            for(int i : piles){
                hrs += (int) Math.ceil((double) i / m);
            }
            if(hrs <= h){
                r = m;
            }
            else{
                l = m + 1;
            }
        }
        return l;
    }
}
