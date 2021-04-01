class Solution {
    public int[] solution(int[] A, int K) {
        if(A.length==0){
            return A;
        }
        K = K % A.length;
        reverse(A, 0, A.length - K - 1);
        reverse(A, A.length - K, A.length - 1);
        reverse(A, 0, A.length - 1);
        return A;
    }
    public void reverse(int[] arr, int i, int j){
        while(i < j){
            arr[i]=arr[i]^arr[j];
            arr[j]=arr[i]^arr[j];
            arr[i]=arr[i]^arr[j];
            i++;
            j--;
        }
    }
}