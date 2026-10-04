class Solution {
   static Boolean[][] memo;
      public static boolean solve(int i , int open ,  String  s){
       boolean isvalid = false;
        if(i==s.length()){
            return open == 0;

        }
        if(memo[i][open] != null){
            return memo[i][open];
        }

        if(s.charAt(i)=='('){
            isvalid |= solve(i+1,open+1,s);
        }else if(s.charAt(i)=='*'){
           isvalid |= solve(i+1,open+1,s);
           isvalid |= solve(i+1,open,s);
            if(open>0){
               isvalid |= solve(i+1,open-1,s);
            }
        }else if(open>0) {
            isvalid |= solve(i+1,open-1,s);

        }
        return memo[i][open] = isvalid;
    }
    public boolean checkValidString(String s) {
        int n = s.length();
        memo = new Boolean[n][n+1];
       return solve(0,0,s);
        
    }
}