class Solution {
    public String reversePrefix(String s, int k) {
      if(k<=1 || k>s.length() || s==null){
        return s;
      }
        char[] chars = s.toCharArray();

        int i = 0;
        int j = k-1;
        while(i<j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}