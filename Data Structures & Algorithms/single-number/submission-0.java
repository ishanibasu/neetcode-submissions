class Solution {
    public int singleNumber(int[] nums) {
        int singleNo = 0;
        for(int i : nums){
            singleNo = singleNo ^ i;
        }
        return singleNo;
    }
}
