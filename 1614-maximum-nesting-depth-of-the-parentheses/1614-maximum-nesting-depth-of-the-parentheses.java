class Solution {
    public int maxDepth(String s) {
        int brackets  = 0;
        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); 
            if(ch=='('){
                brackets++;
                if(brackets>balance){
                    balance = brackets;
                }
            } 
            else if(ch==')'){
                if(brackets>0){
                    brackets--;
                    
                }
            }
           
        }
        return balance;

    }
}