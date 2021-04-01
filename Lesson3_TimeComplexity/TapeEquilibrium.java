class Solution {
    public int Kadane_Algorithm(int[] A,int N,int totalSum)
    {
        int currentSum = A[0];
        int minDiff = Math.abs(currentSum - totalSum );

        for (int i=1 ; i < N-1; i++) {
            currentSum += A[i];
            totalSum -= A[i];

            int currentDiff = Math.abs(totalSum - currentSum);
            minDiff = (currentDiff < minDiff ) ? currentDiff : minDiff;
        }
        return minDiff;
    }

    public int solution(int[] A) {
        int N = A.length;
        int totalSum=0;
        for (int i = 1; i < N; i++) {
            totalSum += A[i];
        }
        int difference=Kadane_Algorithm(A,N,totalSum);
        return difference;

    }
}