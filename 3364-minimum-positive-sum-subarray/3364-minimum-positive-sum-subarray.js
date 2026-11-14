/**
 * @param {number[]} nums
 * @param {number} l
 * @param {number} r
 * @return {number}
 */
var minimumSumSubarray = function(nums, l, r) {
    let min = Infinity;
    for(let i=0; i<nums.length; i++){
        let sum = 0;
        for(let j=i; j<nums.length; j++){
            sum += nums[j];
            let len = j-i+1;
            if(len>=l && len<=r && sum>0){
                min = Math.min(min,sum);
            }
            if (len > r) break;
        }
    }
    return min === Infinity ? -1 : min ;
    
};