class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(r*c!=m*n) return mat;
        int ans [][] = new int[r][c];
        int k = 0, l = 0;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(l==n){
                    l=0; // col
                    k++;
                }
                ans[i][j] = mat[k][l];
                l++;
            }
        }
        return ans;
    }
}