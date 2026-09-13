class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int l = 1; l <= n / 2; l++) {
            if (n % l == 0) {
                int times = n / l;
                String pattern = s.substring(0, l);
                StringBuilder st = new StringBuilder();

                while (times > 0) {
                    st.append(pattern);
                    times--;
                }
                if (st.toString().equals(s)) {
                    return true;
                }
            }

        }
        return false;

    }
}