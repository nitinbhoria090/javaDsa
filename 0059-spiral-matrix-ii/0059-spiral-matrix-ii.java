class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int num  = 1;
        int strow = 0;
        int stcol = 0;
        int endrow = n-1;
        int endcol = n-1;

        while(strow<=endrow && stcol <= endcol){
            for(int i=stcol; i<=endcol; i++){
                mat[strow][i] = num++;
            }
            strow++;
            for(int i=strow; i<=endrow; i++){
                mat[i][endcol] = num++;
            }
            endcol--;
            if(stcol<=endcol){
                for(int i=endcol; i>= stcol; i--){
                    mat[endrow][i] = num++;
                }
                endrow--;
            }
            if(strow<=endrow){
                for(int i=endrow; i>= strow; i--){
                    mat[i][stcol] = num++;
                }
                stcol++;
            }
        }
        return mat;
        
    }
}