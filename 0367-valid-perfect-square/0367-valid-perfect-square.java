class Solution {
    public boolean isPerfectSquare(int n){
        long i = 0;
        long j = n;
        if(n<1) return false;

        while(i<=j){
            long mid = i+(j-i)/2;
            long sq = mid*mid;
            if(sq==n){
                return true;
            }else if(sq>n){
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        return false;
        
    }
}