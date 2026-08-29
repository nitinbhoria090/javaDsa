import java.util.Arrays;
class Solution {
    public int solve(String a, String b, int i, int j, int[][] dp) {

        if (i >= a.length() || j >= b.length())
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (a.charAt(i) == b.charAt(j)) {
            return dp[i][j] = 1 + solve(a, b, i + 1, j + 1, dp);
        } else {
            return dp[i][j] = Math.max(solve(a, b, i, j + 1, dp), solve(a, b, i + 1, j, dp));
        }

    }

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(text1, text2, 0, 0, dp);

    }
}