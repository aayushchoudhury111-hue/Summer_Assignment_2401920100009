class Solution {
    public int maxProfit(int[] arr) {
        int min = arr[0], ans = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            else{
                ans = Math.max(ans, arr[i]-min);
            }
        }
        return ans;
    }
}