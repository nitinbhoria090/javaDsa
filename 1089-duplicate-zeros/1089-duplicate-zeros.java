class Solution {
    public void duplicateZeros(int[] arr) {
        int[] nums = new int[arr.length];
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if (arr[i] == 0) {
                nums[j] = 0;
                if (j + 1 < arr.length) {
                    nums[j + 1] = 0;

                }
                j += 2;
            }
            else{
                nums[j] = arr[i];
                j++;
            }
            i++;
        }
        for(int k=0; k<nums.length; k++){
           arr[k] = nums[k];
        }

    }
}