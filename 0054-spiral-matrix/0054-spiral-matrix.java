class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> mat = new ArrayList<>();
        // int[] mat = new int[n*m];

        int n = matrix.length;
        int m = matrix[0].length;

        int strow = 0;
        int stcol = 0;
        int endrow = n - 1;
        int endcol = m - 1;

        while (strow <= endrow && stcol <= endcol) {
            for(int i=stcol; i<=endcol; i++){
                mat.add(matrix[strow][i]);
            }
            strow++;

            for(int i = strow; i<= endrow; i++){
                mat.add(matrix[i][endcol]);
            }
            endcol--;

            if(strow<=endrow){
                for(int i= endcol; i>= stcol; i--){
                    mat.add(matrix[endrow][i]);
                }
                endrow--;
            }
            if(stcol<=endcol){
            for(int i=endrow; i>=strow; i--){
                mat.add(matrix[i][stcol]);
            }
            stcol++;
            }
        }
        return mat;
    }
}