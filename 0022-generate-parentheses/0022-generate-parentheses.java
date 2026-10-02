// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     List<String> ans; 

//     public boolean ischeck(StringBuilder sb) {
//         int count = 0;
//         for (int i = 0; i < sb.length(); i++) {
//             if (sb.charAt(i) == '(') {
//                 count++;
//             } else { 
//                 count--;
//             }
            
//             if (count < 0) {
//                 return false;
//             }
//         }
//         return count == 0;
//     }

//     public void solve(StringBuilder sb, int i, int n) {
//         if (i == 2 * n) {
//             if (ischeck(sb)) {
//                 ans.add(sb.toString());
//             }
//             return; 
//         }

//         sb.append('(');
//         solve(sb, i + 1, n);
//         sb.deleteCharAt(sb.length() - 1); 

//         sb.append(')');
//         solve(sb, i + 1, n);
//         sb.deleteCharAt(sb.length() - 1); 
//     }

//     public List<String> generateParenthesis(int n) {
//         StringBuilder sb = new StringBuilder();
//         ans = new ArrayList<>();
//         solve(sb, 0, n);
//         return ans; 
//     }
// }




//this is optimize version 

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