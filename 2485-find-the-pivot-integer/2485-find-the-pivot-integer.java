class Solution {
    public int pivotInteger(int n) {
        int prefixsum = 1;
        int suffixsum = n;

        int i = 1;
        int j = n;

        while (i < j) {
            if (prefixsum < suffixsum) {
                i++;
                prefixsum += i;
            } else {
                j--;
                suffixsum += j;

            }
        }
        return prefixsum == suffixsum ? i : -1;

    }
}