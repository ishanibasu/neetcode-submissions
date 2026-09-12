class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap <>();
        for (int i = 0; i < strs.length; i++){
            char[] sortedArr = 
            strs[i].toCharArray();
            Arrays.sort(sortedArr);
            String sorted = new String (sortedArr);
            if (!map.containsKey(sorted)) {
                List <String> l = new ArrayList <>();
                map.put(sorted, l);
            }
                map.get(sorted).add(strs[i]);
        }
        return new ArrayList <>(map.values());  
    }
}
