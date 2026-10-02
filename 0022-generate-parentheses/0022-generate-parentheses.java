class Solution {
    private List<String> ans;

    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        ans = new ArrayList<>();
        solve(sb, 0,0, n);
        return ans;

    }
    private void solve(StringBuilder sb, int open, int close, int n) {
        if (sb.length() == 2 * n) {    
             ans.add(sb.toString());
            return;

        }
        if(open<n){
            sb.append('(');
            solve(sb , open+1,close,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            solve(sb,open,close+1,n);
            sb.deleteCharAt(sb.length()-1);
        }

        
    }

}