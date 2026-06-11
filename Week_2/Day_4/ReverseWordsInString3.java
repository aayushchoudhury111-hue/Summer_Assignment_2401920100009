class Solution {
    public String reverseWords(String s) {
        String st = "";
        String ans = "";
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!=' ') st = ch+st;
            else{
                ans += st + ch;
                st = "";
            }
        }
        ans+= st;
        return ans;
    }
}