class Solution {
    public int solution(int[] H) {
        int total = 0;
        Stack<Integer> s = new Stack<>();
        s.push(0);
        for (int i=0;i<H.length;i++) {
            while (s.peek() > H[i]) {
                s.pop();
            }
            if (s.peek() != H[i]) {
                s.push(H[i]);
                ++total;
            }
        }
        return total;
    }
}