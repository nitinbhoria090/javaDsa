class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int num : nums1){
            set.add(num);
        }

        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i]) && !arr.contains(nums2[i])){
                arr.add(nums2[i]);
            }

        }
        int[] nums = new int[arr.size()];

        for(int i=0; i<arr.size(); i++){
            nums[i] = arr.get(i);
        }
        return nums;
  
    }
}