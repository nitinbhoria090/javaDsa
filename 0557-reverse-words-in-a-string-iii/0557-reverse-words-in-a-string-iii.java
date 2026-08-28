class Solution {
    public String reverseWords(String s) {
       if(s.isEmpty() || s==null){
        return null;
       }

       char[] ch = s.toCharArray();
       int n = ch.length;
       int start = 0;

       for(int end = 0; end<=n; end++){
        if(end == n || ch[end] == ' '){
            reverse(ch,start,end-1);
            start = end+1;

        }

       }
        return new String(ch);
    }
      

       private static void reverse(char[] ch, int left, int right){
        while(left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
       
    }
}