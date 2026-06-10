class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String t = s + s;
        t = t.substring(1, t.length()-1);
        for(int i = 0; i<t.length()-s.length()+1; i++){
            int j = 0;
            int idx = i;
            while(j<s.length() && t.charAt(idx)==s.charAt(j)){
                j++;
                idx++;
            }
            if(j==s.length()) return true;
        }
        return false;
    }
}
