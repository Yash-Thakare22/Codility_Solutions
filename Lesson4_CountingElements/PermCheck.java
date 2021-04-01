class Solution {
    public int solution(int[] A) {
        int[] count = new int [A.length];
        for(int i= 0; i< A.length; i++){
            if (A[i] > A.length || A[i]<1) {
                return 0;
            }
            else if(count[A[i]-1] == 1) {
                return 0;
            }
            else {
                count[A[i]-1] = 1;
            }
        }
        return 1;
    }
}