/**
 * @param {number[]} nums
 * @return {number}
 */
var minMoves = function(nums) { 
    let count = 0;
    let max = Math.max(...nums);
    for(let i=0; i<nums.length; i++){
        if(nums[i]<max){
            count += max-nums[i];
        }
    }
    return count;
};