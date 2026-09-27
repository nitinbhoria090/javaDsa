class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ')') {
                st.push(ch);
            } else {
                ArrayList<Character> temp = new ArrayList<>();
                while (!st.isEmpty() && st.peek() != '(') {
                    temp.add(st.pop());
                }
                if (!st.isEmpty()) {
                    st.pop();
                }
                for (char c : temp) {
                    st.push(c);

                }
            }

        }
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }
}