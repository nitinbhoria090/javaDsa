class Solution {
    public int minStartValue(int[] nums) {
        int minsum = 0;
        int runningsum = 0;

        for(int num : nums){
            runningsum += num;
            if(runningsum<minsum){
                minsum = runningsum;
            }
        }
        return 1-minsum;
        
    }
}