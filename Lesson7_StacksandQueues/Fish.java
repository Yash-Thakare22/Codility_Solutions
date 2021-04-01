class Solution {
    public int solution(int[] A, int[] B) {
        int noofFish = A.length;
        if(noofFish == 0)
            return 0;

        Deque<Integer> down = new ArrayDeque<Integer>();
        for(int i = 0; i < A.length; i++){
            if(B[i] == 1){
                down.push(A[i]); 
            }
            else{
                while( !down.isEmpty() ){ 
                    if( down.peek() > A[i] ){
                        noofFish--;
                        break;    
                    }
                    else {
                        noofFish--;
                        down.pop();
                    }
                }
            }  
        }    
        return noofFish;
    }
}