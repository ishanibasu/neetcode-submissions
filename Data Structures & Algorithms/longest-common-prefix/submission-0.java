class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        for(int i = 1; i < strs.length; i++){
            int j = 0;
            while(j < first.length() && j < strs[i].length() && first.charAt(j) == strs[i].charAt(j)){
                j++;
            }
            first = first.substring(0, j);
            if (first.length() == 0) return "";
        } 
        return first;     
    }
}