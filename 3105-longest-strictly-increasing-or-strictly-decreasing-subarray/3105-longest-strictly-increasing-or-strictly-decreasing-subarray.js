/**
 * @param {number[]} nums
 * @return {number}
 */
var longestMonotonicSubarray = function(nums) {
   
   let inc = 1;

   for(let i=0; i<nums.length; i++){
    let count1 = 1;
    let count2 = 1;
    for(let j=i+1; j<nums.length; j++){
      if(nums[j]>nums[j-1]){
        count1++;
      }else{
        break;
      }
    }
   for (let j = i + 1; j < nums.length; j++) {
            if (nums[j] < nums[j - 1]) {
                count2++;
            } else {
                break; 
            }
        }
    inc = Math.max(inc,count1,count2);
   }
    return inc;
    
};