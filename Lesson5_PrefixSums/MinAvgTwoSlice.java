class Solution {
    public int solution(int[] A) {
        float avg = 0f,minAvg = Float.MAX_VALUE;
        int index = 0,P = 0,prefix=0,i;
        float sum[] = new float[A.length];
        for (i = 0; i < A.length; i++) {
            prefix += A[i];
            sum[i] += prefix;
        }
        for (i = 1; i < A.length; i++) {
            avg = (sum[i] - sum[P] + A[P]) / (i - P + 1);
            if (avg < minAvg) {
                minAvg = avg;
                index = P;
            }
            if (A[i] < minAvg) {
                P = i;
            }
        }
        return index;
    }
}

//2nd Solution

class Solution {
    public int solution(int[] A) {
        float avg = 0f;
        int index = 0;
        int P = 0;
        float sum[] = new float[A.length];
        sum[0]=A[0];
        for (int i = 1; i < A.length; i++) {
            sum[i] = sum[i-1] +A[i];
        }
        float minAvg = Float.MAX_VALUE;
        for (int i = 1; i < A.length; i++) {
            avg = (sum[i] - sum[P] + A[P]) / (i - P + 1);
            if (avg < minAvg) {
                minAvg = avg;
                index = P;
            }
            if (A[i] < minAvg) {
                P = i;
            }
        }
        return index;
    }
}