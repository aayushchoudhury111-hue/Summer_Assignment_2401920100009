class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                str+=ch;
            }
        }
        str = str.toLowerCase();
        System.out.println(str);
        int n = str.length();
        for(int i = 0; i<n/2; i++){
            if(str.charAt(i)!=str.charAt(n-i-1)) return false;
        }
        return true;
    }
}