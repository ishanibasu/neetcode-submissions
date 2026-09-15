class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet <Integer> set = new HashSet <>();
        int missing = 1;
        for(int i : nums){
            set.add(i);
        }
        while (set.contains(missing)){
            missing++;
        }
        return missing;
    }
}