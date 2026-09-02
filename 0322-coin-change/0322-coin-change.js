/**
 * @param {number[]} nums
 * @param {number} amount
 * @return {number}
 */
 function mincost(nums,i,amount,dp){
    if(amount===0) return 0;
    if(i>=nums.length) return Infinity;
    
    if(nums[i]>amount){
        return  dp[i][amount] =  mincost(nums,i+1,amount,dp)
    }
    if(dp[i][amount] !== -1) return dp[i][amount]
    let take = 1 + mincost(nums,i,amount-nums[i],dp);
    let skip = mincost(nums,i+1,amount,dp)
    dp[i][amount] =  Math.min(take,skip)
    return dp[i][amount]


 }
var coinChange = function(nums, amount) {
    let n = nums.length
    let dp   = Array.from({length:n},()=>Array(amount+1).fill(-1))
    let ans =  mincost(nums,0,amount,dp)
    return ans === Infinity ? -1 : ans

};