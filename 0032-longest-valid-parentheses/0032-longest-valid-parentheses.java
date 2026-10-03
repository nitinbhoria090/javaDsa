class Solution {
    public int longestValidParentheses(String s) {
        int open = 0;
        int close = 0;
        int result = 0;

        //left to right

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch=='('){
                open++;
            }else{
                close++;
            }
            if(open==close){
                result = Math.max(result,open+close);
            }else if(close>open){
                open = 0;
                close = 0;
            }
        }
        //right to left 

        open = 0;
        close = 0;

        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch==')'){
                close++;
            }else{
                open++;
            }
            if(open==close){
                result = Math.max(result,open+close);
            }else if(open>close){
                open = 0;
                close = 0;
            }
        }
        return result;
        
    }
}