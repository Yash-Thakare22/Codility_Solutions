class Solution {
    public int solution(String S) {
        Stack<Character> s = new Stack<>();
        for(char c : S.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') 
                s.push(c);
            else if(s.size() != 0 && (c == ')' && s.peek() == '(')) 
                s.pop();
            else if(s.size() != 0 && (c == '}' && s.peek() == '{' )) 
                s.pop();
            else if(s.size() != 0 && ( c == ']' && s.peek() == '[')) 
                s.pop();
            else 
                return 0;
        }
        return s.isEmpty()?1:0;
    }
}