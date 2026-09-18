/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let maxprofit = 0;
     let min = prices[0];
    let max;
    for(let i=0; i<prices.length; i++){
        if(prices[i]<min){
            min = prices[i];
        }
        max = prices[i]-min; 
        if(maxprofit<max){
        maxprofit = max;
         }
    }
    return maxprofit;
    
};