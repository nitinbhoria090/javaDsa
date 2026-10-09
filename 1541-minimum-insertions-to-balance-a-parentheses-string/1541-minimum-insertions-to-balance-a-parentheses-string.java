class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int neededRights = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                neededRights += 2;
                if (neededRights % 2 != 0) {
                    insertions++;
                    neededRights--;
                }
            } else {
                neededRights--;
                if (neededRights < 0) {
                    insertions++;
                    neededRights += 2;
                }
            }
        }
        
        return insertions + neededRights;
    }
}
