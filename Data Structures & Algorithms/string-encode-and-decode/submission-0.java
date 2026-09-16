class Solution {

    public String encode(List<String> strs) {
        String st = "";
        for(String str : strs){
            st += str.length() + "#" + str;
        }
        return st;
    }

    public List<String> decode(String str) {
        List <String> lst = new ArrayList <>();
        if (str.length() == 0) return lst;
        int i = 0;
        while (i < str.length()){
            int j = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j + 1, j + 1 + length);
            lst.add(word);
            i = j + 1 + length;
        }
        return lst;
    }
}
