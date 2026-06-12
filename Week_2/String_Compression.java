class Solution {
    public int compress(char[] arr) {
        int count = 0;
        String s = "";
        char curr = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(curr == arr[i]){
                count++;
            }
            else{
                s += curr;
                if(count != 1) s += count;
                count = 1;
                curr = arr[i];
            }
        }
        s += curr;
        if(count != 1) s += count;
        for(int i = 0; i<s.length(); i++){
            arr[i] = s.charAt(i);
        }
        return s.length();
    }
}