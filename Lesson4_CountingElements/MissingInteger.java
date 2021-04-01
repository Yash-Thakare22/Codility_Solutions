class Solution {
    public int solution(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (start <= end) {
            int index = A[start] - 1;
            if (index == start)
                start++;
            else if (index < 0 || index > end || A[start] == A[index])
                A[start] = A[end--];
            else {
            A[start] = A[index];
                A[index] = index + 1;
            }
        }
        return start + 1;
    }
}


//2nd Solution //Best
class Solution {
    public void swap(int[] arr, int j, int k) {
        arr[j]=arr[j]^arr[k];
        arr[k]=arr[j]^arr[k];
        arr[j]=arr[j]^arr[k];
    }

    public int solution(int[] A) {
        int start = 0;
        int end = A.length ;

        while (start < end) {
            if (A[start] == start+1)  // already in the right place
            start ++; 
            else if (A[start] <= 0 || A[start] > end || A[start] == A[A[start]-1]) {
                swap(A, start, --end); // out of range or duplicate, put it at the end
            } else {
                swap(A, start, A[start]-1); // within range; put it in the right place
            }
        }
        return end + 1;
    }
}