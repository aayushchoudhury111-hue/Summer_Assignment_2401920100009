class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String st = "";
        for(int i = 0; i<strs[0].length(); i++){
            char curr = strs[0].charAt(i);
            int count = 0;
            for(int j = 0; j<strs.length; j++){
                if(strs[j].charAt(i)!=curr) {
                    count = 1;
                    break;
                }
            }
            if(count == 0){
                count = 0;
                st+=curr;
            }
            else break;
        }
        return st;
    }
}