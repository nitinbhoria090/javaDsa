class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int strow = 0;
        int endrow = row-1;

        while(strow<=endrow){
            int mid = strow+(endrow-strow)/2;
            if(matrix[mid][0]<=target && target <= matrix[mid][col-1]){
                int stcol = 0;
                int endcol = col-1;

                while(stcol<=endcol){
                    int midterm = stcol+(endcol-stcol)/2;
                    if(matrix[mid][midterm]==target){
                        return true;
                    }else if(matrix[mid][midterm]>target){
                        endcol = midterm-1;
                    }else {
                        stcol = midterm+1;
                    }
                    
                }
                return false;
            }else if(matrix[mid][col-1]>target){
                endrow = mid-1;
            }else {
                strow = mid+1;
            }
            
        }
        return false;
    }
}