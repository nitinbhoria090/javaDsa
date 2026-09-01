class Solution {
    public String largestNumber(int[] nums) {
        String[] numstrings = new String[nums.length];

        for(int i=0; i<nums.length; i++){
            numstrings[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(numstrings,(a,b)->(b+a).compareTo(a+b));

        if(numstrings[0].equals("0")){
            return "0";
        }

        StringBuilder largest = new StringBuilder();

        for(String num : numstrings){
            largest.append(num);
        }
        return largest.toString();
        
    }
}