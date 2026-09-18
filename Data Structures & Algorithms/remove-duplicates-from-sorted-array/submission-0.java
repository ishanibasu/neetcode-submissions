class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1, j = 0;
        while (i < nums.length){
            if(nums[i] != nums[j]){
                j++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i++;
        }
        return j + 1;
    }
}