class Solution {
    public int differenceOfSums(int n, int m) {
        
        int sumnd = 0;
        int sum2d = 0;

        for(int i=1; i<=n; i++){
            if(i%m==0){
                
                sum2d += i;
            }else{
               
               sumnd += i;
            }
        }
        return sumnd-sum2d;
        
    }
}