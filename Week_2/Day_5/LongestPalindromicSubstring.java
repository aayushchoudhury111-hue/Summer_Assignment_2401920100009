class Solution {
    public String longestPalindrome(String s) {
        int count=0;
        String ans = "";
        // odd palindrome count;
        for(int axis = 0; axis<s.length(); axis++){
            int orbit = 0;
            String curr = "";
            curr += s.charAt(axis);
            while(axis-orbit>=0 && axis+orbit<s.length()){
                if(s.charAt(axis-orbit)==s.charAt(axis+orbit)){
                    char ch = s.charAt(axis-orbit);
                    if(orbit!=0)
                        curr = ch+curr+ch;
                }
                else break;
                orbit++;
            }
            if(curr.length()>ans.length()) ans=curr;
        }
        // even palindromic count
        for(double axis = 0.5 ; axis<s.length()-1; axis++){
            double orbit = 0.5;
            String curr = "";
            while((int)(axis-orbit)>=0 && (int)(axis+orbit) <s.length()){
                if(s.charAt((int)(axis-orbit))==s.charAt((int)(axis+orbit))){
                    char ch = s.charAt((int)(axis-orbit));
                    curr = ch+curr+ch;
                }
                else break;
                orbit++;
            }
            if(curr.length()>ans.length()) ans = curr;
        }
        return ans;
    }
}