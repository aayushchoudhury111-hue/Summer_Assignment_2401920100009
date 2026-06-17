class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else{
                if(st.size()==0) return false;
                char top = st.peek();
                if(sameStyle(top, ch)) st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
    private static boolean sameStyle(char ch , char top){
        if((ch == '[' && top == ']') || (ch == '(' && top == ')') || (ch == '{' && top == '}')) return true;
        return false;
    }
}