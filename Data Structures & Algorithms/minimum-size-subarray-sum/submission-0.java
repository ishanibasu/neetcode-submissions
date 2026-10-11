class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0;
        int sum = 0, cnt = Integer.MAX_VALUE;
        while (j < nums.length){
            sum += nums[j];
            while(sum >= target){
                cnt = Math.min(cnt, j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        if(cnt == Integer.MAX_VALUE) return 0;
        return cnt;
    }
}