class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
       int[] arr = new int[2];

        int r = grid.length;
        int c = grid[0].length;

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(set.contains(grid[i][j])){
                    arr[0] = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        
        int n = r*c;
         for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                arr[1] = i;
                break;
            }
         }
         return arr;
    }
}