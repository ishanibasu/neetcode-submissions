class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder org = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                org.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        char [] rev = org.toString().toCharArray();
        int i = 0, j = rev.length - 1;
        while(i < j){
            char temp = rev[i];
            rev[i] = rev[j];
            rev[j] = temp;
            i++;
            j--;
        }
        return org.toString().equals(new String(rev));
    }
}
