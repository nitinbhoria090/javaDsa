class Solution {
 private int[] dp;

    public int rob(int[] nums) {
        int n = nums.length;
         if (n == 1) return nums[0];
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        dp = new int[n];

         Arrays.fill(dp, -1);

        int takeF = solve(0, n - 2, nums);

        Arrays.fill(dp, -1);
        int skipF = solve(1, n-1, nums);
        return Math.max(takeF, skipF);
    }

    private int solve(int i, int n, int[] nums) {

        if (i > n) return 0;

        if (dp[i] != -1) return dp[i];

        int take = nums[i] + solve(i + 2, n, nums);

        int nTake = solve(i + 1, n, nums);

        dp[i] = Math.max(take, nTake);

        return dp[i];
    }
}