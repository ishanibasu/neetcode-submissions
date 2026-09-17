class Solution {
    public String mergeAlternately(String word1, String word2) {
        String finalWord = "";
        int index1 = 0, index2 = 0;
        while(index1 < word1.length() && index2 < word2.length()){
            finalWord += word1.charAt(index1);
            finalWord += word2.charAt(index2);
            index1++;
            index2++;
        }
        while(index1 < word1.length()) {
            finalWord += word1.charAt(index1);
            index1++;
        }
        while(index2 < word2.length()){
            finalWord += word2.charAt(index2);
            index2++;
        }
        return finalWord;
    }
}