class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return -1;
        }

        int nlen = haystack.length();
        int hlen = needle.length();

        for(int i=0; i<=nlen-hlen; i++){
            if(haystack.substring(i,i+hlen).equals(needle)){
                return i;
            }
        }
        return -1;
        
    }
}