class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
       int[] arr = new int[2];

        int r = grid.length;
        int c = grid[0].length;
        int currentsum = 0;

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(set.contains(grid[i][j])){
                    arr[0] = grid[i][j];
                }else{
                set.add(grid[i][j]);
                currentsum += grid[i][j];
                }
            }
        }
        int l = r*c;
         int totalsum = l*(l+1)/2;
         int missing = totalsum-currentsum;
         arr[1] = missing;
         return arr;
    }
}