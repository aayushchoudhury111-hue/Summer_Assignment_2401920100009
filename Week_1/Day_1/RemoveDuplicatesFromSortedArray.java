class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        if(n==1) return n;
        int i = 0;
        int j = 1;
        int ele = arr[n-1]+1;
        while(j<n){
            if(arr[i]==arr[j]){
                arr[j]=ele;
                j++;
            }
            else{
                i=j;
                j=i+1;
            }
        }
        Arrays.sort(arr);
        int count=0;
        for(i = 0; i<n; i++){
            if(arr[i]<ele) count++;
            else break;
        }
        return count ;
    }
}