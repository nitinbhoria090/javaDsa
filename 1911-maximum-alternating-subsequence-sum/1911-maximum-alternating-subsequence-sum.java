class Solution {
  
    public static long solve(int idx,int[] nums, boolean flag, long[][] dp){
        long n = nums.length;
        if(idx>=n){
            return 0;
        }
         int flagidx = flag ? 1 : 0;
        if(dp[idx][flagidx] != 0){
            return dp[idx][flagidx];
        }
        long skip = solve(idx+1,nums,flag,dp);
       long val = nums[idx];
        if(flag == false){
            val = -val;
        }
        long take = solve(idx+1,nums,!flag,dp)+val;
        return dp[idx][flagidx] = Math.max(skip,take);
    }
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[][] dp = new long[n][2];
        return solve(0,nums,true,dp);
    }
}