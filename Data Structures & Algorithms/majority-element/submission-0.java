class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0, el = 0;
        for(int i : nums){
            if (cnt == 0) {
                cnt = 1;
                el = i;
            }
            if (i == el) cnt ++;
            else cnt --;
        }
        int cnt1 = 0;
        for(int i : nums){
            if (i == el) cnt1++;
        }
        if(cnt1 > nums.length / 2) return el;
        return -1;
    }
}