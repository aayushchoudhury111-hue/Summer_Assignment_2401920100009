class Solution {
    public List<String> generateParenthesis(int n) {
        String s="";
        List<String> ans = new ArrayList<>();
        para(ans, n, 0, 0, s);
        return ans;
    }
    public static void para(List<String> ans, int n, int open, int close, String s){
        if(close==n){
            ans.add(s);
            return;
        }
        if(open<n) para(ans, n, open +1 , close, s+'(');
        if(close<open) para(ans, n, open, close+1, s+')');
    }
}
