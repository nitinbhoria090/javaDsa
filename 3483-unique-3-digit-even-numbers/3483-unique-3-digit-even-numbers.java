class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
       
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            if(digits[i]==0) {
                continue;
            }
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(i==j || j==k || i==k){
                        continue;
                    }else{
                        int number = digits[i]*100 + digits[j]*10 + digits[k]*1;
                        if(number>=100 && number % 2 == 0){
                            set.add(number);
                        } 
                    }

                }
            }
        }
        return set.size();
        
    }
}