class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int i=0;
        int j=i;
        int t=-1;
        while(i<n){
            if(j==n){
                t=i;
                break;
            }
            if(i!=j && s.charAt(i)==s.charAt(j)){
                i++;
                j=0;
            }
            else {
                j++;
            }
        }
        return t;
    }
}