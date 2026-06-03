class Solution {
    public void moveZeroes(int[] arr) {
        int t ;
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                if(i!=j){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
                j++;
            }
        }
    }
}