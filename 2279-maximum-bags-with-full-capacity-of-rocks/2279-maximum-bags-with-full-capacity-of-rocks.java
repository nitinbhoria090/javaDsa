import java.util.Arrays;
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] required = new int[capacity.length];

        for(int i=0; i<capacity.length; i++){
            required[i] = capacity[i]-rocks[i];
        }

        Arrays.sort(required);
        int count = 0;

        for(int i=0; i<required.length; i++){
            if(required[i] ==0){
                count++;

            }else{
                if(additionalRocks >= required[i]){
                    additionalRocks -= required[i];
                    count++;
                }
            }
        }
        return count;

    }
}