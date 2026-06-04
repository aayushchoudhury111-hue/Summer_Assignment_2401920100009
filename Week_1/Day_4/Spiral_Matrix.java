class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;
        int fc = 0, lc = col -1 , fr = 0, lr = row - 1;
        int count = 0;
        while(true){
            for(int j = fc ; j<=lc; j++ ){
                count ++;
                ans.add(arr[fr][j]);
            }
            fr++;
            if(count==(row*col)) break;
            for(int i = fr; i <= lr ; i++){
                count ++;
                ans.add(arr[i][lc]);
            }
            lc--;
            if(count==(row*col)) break;
            for(int j = lc; j>=fc; j--){
                count ++;
                ans.add(arr[lr][j]);
            }
            lr--;
            if(count==(row*col)) break;
            for(int i = lr ; i>=fr; i--){
                count ++;
                ans.add(arr[i][fc]);
            }
            fc++;
            if(count==(row*col)) break;
        }
        return ans;
    }
}