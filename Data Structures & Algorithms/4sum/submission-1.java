class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List <List<Integer>> lst = new ArrayList <>();
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < nums.length; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                int l = j + 1, r = nums.length - 1;
                while(l < r){
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum == target){
                        List <Integer> el = new ArrayList<>();
                        el.add(nums[i]);
                        el.add(nums[j]);
                        el.add(nums[l]);
                        el.add(nums[r]);
                        lst.add(el);
                        l++;
                        r--;
                        while(l < r && nums[l] == nums[l - 1]) l++;
                        while(l < r && nums[r] == nums[r + 1]) r--;
                    }
                    else if(sum < target) l++;
                    else r--;
                }
            }
        }
        return lst;
    }
}