class Solution {
    public boolean divisorGame(int n) {
        int x = 1;

        while(x<n){
            if(n % 2 == 0){
                return true;
            }
            x++;

        }
        return false;
    }
}