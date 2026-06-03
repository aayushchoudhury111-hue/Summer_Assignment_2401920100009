class Solution {
    public int maxArea(int[] arr) {
        int max = 0;
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]<arr[j]){
                max = Math.max(arr[i]*(j-i), max);
                i++;
            }
            else{
                max = Math.max(arr[j]*(j-i), max);
                j--;
            }
        }
        return max;
    }
}