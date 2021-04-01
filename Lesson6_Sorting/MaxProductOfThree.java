class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        int maxNegNo = A[0] * A[1] * A[n - 1];
        int maxPosNo = A[n - 3] * A[n - 2] * A[n - 1];
        return Math.max(maxNegNo, maxPosNo);
    }
}