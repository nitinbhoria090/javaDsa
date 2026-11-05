/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @param {number} d
 * @return {number}
 */
var findTheDistanceValue = function(arr1, arr2, d) {
 return arr1.filter(nums1=>arr2.every(nums2=>Math.abs(nums1-nums2)>d)).length;  
};