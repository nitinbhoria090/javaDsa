class Solution {
    public int scoreOfParentheses(String s) {
        int bracket = 0;
        int score = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                bracket++;
            }else{
                bracket--;

                if(s.charAt(i-1)=='('){
                    score += Math.pow(2,bracket);
                }
            }
        }
        return score;

        
    }
}