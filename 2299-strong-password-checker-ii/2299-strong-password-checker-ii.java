class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean digit = false;
        boolean upper = false;
        boolean lower = false;
        boolean special = false;

       

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                lower = true;
            } else if (ch >= 'A' && ch <= 'Z') {
                upper = true;
            } else if (ch >= '0' && ch <= '9') {
                digit = true;
            } else {
                special = true;
            }
            if (i > 0 && password.charAt(i) == password.charAt(i - 1)) {
                return false;
            }

        }
        return digit && special && lower && upper;

    }
}