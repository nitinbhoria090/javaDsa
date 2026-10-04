// class Solution {
//    static Boolean[][] memo;
//       public static boolean solve(int i , int open ,  String  s){
//        boolean isvalid = false;
//         if(i==s.length()){
//             return open == 0;

//         }
//         if(memo[i][open] != null){
//             return memo[i][open];
//         }

//         if(s.charAt(i)=='('){
//             isvalid |= solve(i+1,open+1,s);
//         }else if(s.charAt(i)=='*'){
//            isvalid |= solve(i+1,open+1,s);
//            isvalid |= solve(i+1,open,s);
//             if(open>0){
//                isvalid |= solve(i+1,open-1,s);
//             }
//         }else if(open>0) {
//             isvalid |= solve(i+1,open-1,s);

//         }
//         return memo[i][open] = isvalid;
//     }
//     public boolean checkValidString(String s) {
//         int n = s.length();
//         memo = new Boolean[n][n+1];
//        return solve(0,0,s);

//     }
// }
class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> aster = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == '*') {
                aster.push(i);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else if (!aster.isEmpty()) {
                    aster.pop();
                } else {
                    return false;
                }
            }
           

        }
         while (!stack.isEmpty() && !aster.isEmpty()) {
                if (stack.peek() > aster.peek()) {
                    return false;
                }
                stack.pop();
                aster.pop();
            }
        return stack.isEmpty();

    }

}
