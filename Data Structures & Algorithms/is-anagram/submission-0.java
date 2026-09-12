class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> map_s = new HashMap <>();
        HashMap <Character, Integer> map_t = new HashMap <>();

        for(int i = 0; i < s.length(); i++){
            map_s.put(s.charAt(i), map_s.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            map_t.put(t.charAt(i), map_t.getOrDefault(t.charAt(i), 0) + 1);
        }
        if (map_s.equals(map_t)) return true;
        return false;
    }
}
