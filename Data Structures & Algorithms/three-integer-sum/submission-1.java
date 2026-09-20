class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List <List<Integer>> lst = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List <Integer> elements = new ArrayList<>();
                    elements.add(nums[i]);
                    elements.add(nums[j]);
                    elements.add(nums[k]);
                    lst.add(elements);
                    j++; 
                    k--;
                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                }
                else if (sum < 0) j++;
                else k--;
            }
        }
        return lst;
    }
}
