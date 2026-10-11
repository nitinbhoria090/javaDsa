class Solution {
    public boolean isPalindrome(String s) {
        char[] str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().toCharArray();
        int i = 0;
        int j = str.length-1;

        while(i<=j){
            if(str[i] != str[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;

        
    }
}