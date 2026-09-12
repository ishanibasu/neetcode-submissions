class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left = 1, right = 1;
        int [] prod = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            prod[i] = left;
            left *= nums[i];
        }
        for(int i = nums.length - 1; i >= 0; i--){
            prod[i] *= right;
            right *= nums[i];
        }
        return prod;
    }
}
