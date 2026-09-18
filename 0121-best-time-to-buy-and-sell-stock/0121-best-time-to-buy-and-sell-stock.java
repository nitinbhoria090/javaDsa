class Solution {
    public int maxProfit(int[] prices) {
        int currentprofit = 0;
        int maxprofit = 0;

        for(int i=1; i<prices.length; i++){
            int diff = prices[i]-prices[i-1];
            currentprofit = currentprofit+diff;

            if(currentprofit<0){
                currentprofit = 0;
            }
        
           if(maxprofit<currentprofit){
            maxprofit = currentprofit;
           }

        }
        return maxprofit;
        
    }
}