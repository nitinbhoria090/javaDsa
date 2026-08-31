class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int maxscore = 0;
        int score = 0;
        int i = 0;
        int j = tokens.length - 1;
        while (i <= j) {

            if (power >= tokens[i]) {
                power -= tokens[i];
                score += 1;
                i++;

                maxscore = Math.max(maxscore, score);
            }

            else if (score >= 1) {
                power += tokens[j];
                score--;
                j--;

            } else {
                return maxscore;
            }

        }
        return maxscore;

    }
}