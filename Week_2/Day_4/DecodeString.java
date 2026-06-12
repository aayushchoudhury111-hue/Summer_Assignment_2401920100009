class Solution {
    public String decodeString(String s) {

        Stack<Integer> n = new Stack<>();
        Stack<StringBuilder> alp= new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            else if(ch == '[') {
                n.push(num);
                alp.push(curr);

                num = 0;
                curr = new StringBuilder();
            }
            else if(ch == ']') {
                int repeat = n.pop();
                StringBuilder prev = alp.pop();

                for(int i = 0; i < repeat; i++) {
                    prev.append(curr);
                }
                curr = prev;
            }
            else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}