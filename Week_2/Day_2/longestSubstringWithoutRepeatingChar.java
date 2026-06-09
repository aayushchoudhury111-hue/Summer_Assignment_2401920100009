class Solution {
    public int lengthOfLongestSubstring(String s) {
        // sliding window--->
        HashSet<Character> set = new HashSet<>();
        int st = 0;
        int en = 0;
        int ans = 0;
        while(en<s.length()){
            char ch = s.charAt(en);
            if(!set.contains(ch)) set.add(ch);
            else {
                while(set.contains(ch) && st<=en){
                    set.remove(s.charAt(st));
                    st++;
                }
                set.add(ch);
            }
            ans = Math.max(ans, en-st+1);
            en++;
        }
        return ans;
    }
}