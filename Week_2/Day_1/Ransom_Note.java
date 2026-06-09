class Solution {
    public boolean canConstruct(String s, String t) {
        int a[] = new int[26];
        for(int i = 0; i<t.length(); i++){
            a[t.charAt(i) - 'a']++;
        }
        for(int i = 0; i<s.length(); i++){
            if(a[s.charAt(i) - 'a'] > 0) a[s.charAt(i)-'a']--;
            else return false;
        }
        return true;
    }
}