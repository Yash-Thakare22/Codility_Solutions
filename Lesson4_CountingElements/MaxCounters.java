class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int max = 0;
        int absMax = 0;
        for (int i=0; i<A.length; i++) {
            if (A[i] == N+1) {
                if ((i < A.length-1 && A[i+1] != N+1) || (i==A.length-1)) {
                    absMax += max;
                    max = 0;
                    counters = new int[N];
                }
            } 
            else {
                counters[A[i]-1]++;
                if (max < counters[A[i]-1])
                    max = counters[A[i]-1];
            }
        }
        for (int i=0; i<counters.length; i++)
            counters[i] += absMax;
        return counters;
    }
}


//2nd solution
class Solution {
    public int[] solution(int N, int[] A) {
        int len = A.length, maxCount = 0, last= 0;
        int max = N + 1;
        int res[] = new int[N];
        for (int i = 0; i < len; ++i ) {
            if(A[i] == max){
                last = maxCount;
            } 
            else if (A[i] <= N)  {
                int pos = A[i]-1;
                res[pos] = res[pos] > last? res[pos] + 1 : last + 1;
                if(maxCount <=  res[pos]) {
                    maxCount = res[pos];
                }
            }
        }
        for (int i = 0; i < N; ++i) {
            if(res[i] < last) {
               res[i] = last;
            }
        }
        return res;
    }
}