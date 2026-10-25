class Solution {
    public int differenceOfSums(int n, int m) {
        List<Integer> notdiv = new ArrayList<>();
        List<Integer> div = new ArrayList<>();
        int sumnd = 0;
        int sum2d = 0;

        for(int i=1; i<=n; i++){
            if(i%m==0){
                div.add(i);
                sum2d += i;
            }else{
               notdiv.add(i);
               sumnd += i;
            }
        }
        return sumnd-sum2d;
        
    }
}