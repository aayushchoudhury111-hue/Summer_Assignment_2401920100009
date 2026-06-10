class Solution {
    public int strStr(String s, String t) {
        for(int i = 0; i<s.length()-t.length()+1; i++){
            int j = 0;
            int idx = i;
            while(j<t.length() && s.charAt(idx) == t.charAt(j)){
                idx++;
                j++;
            }
            if(j==t.length()) return i;
        }
        return -1;
    }
}