class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int en = 0;
        int st = 0;
        double ans = 0;
        for(en = 0; en<k; en++){
            ans += arr[en];
        }
        double max = ans/k;
        while(en!=arr.length){
            ans -= arr[st];
            ans += arr[en];
            en++;
            st++;
            max = Math.max(ans/k, max);
        }
        return max;
    }
}