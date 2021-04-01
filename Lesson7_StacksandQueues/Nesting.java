class Solution {
    public int solution(String S) {
        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            switch (c) {
                case ')':
                    if (st.isEmpty() || st.pop() != '(')
                        return 0;
                    break;
                case ']':
                    if (st.isEmpty() || st.pop() != '[')
                        return 0;
                    break;
                case '}':
                    if(st.isEmpty() || st.pop() != '{')
                        return 0;
                    break;
                default:
                    st.push(c);
                    break;
            }
        }
        return st.isEmpty() ? 1 : 0;
    }
}