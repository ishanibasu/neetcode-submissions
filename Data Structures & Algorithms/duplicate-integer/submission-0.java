class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isDup = false;
        Set <Integer > set = new HashSet <>(); 
        for(int i : nums){
            if (set.contains(i)) isDup = true;
            set.add(i);
        }
        return isDup;
    }
}