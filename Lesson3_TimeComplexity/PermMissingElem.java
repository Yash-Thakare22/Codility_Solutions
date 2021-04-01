class Solution {
    public int solution(int[] A) {
        long count=A.length;
        long totalSum= (count+1) * (count+2) / 2;      
        int sum=0;
          for (int i = 0; i < count; i++)
          {
             sum+=A[i];
          }
        int diff=(int)(totalSum-sum);
        return diff;
    }
}


//2nd solution
class Solution {
   public int solution(int[] A) {
	int size = A.length;
        boolean[] arr = new boolean[size+1];        
        for(int val : A) {  
            arr[val-1] = true;  
        }
        for(int i=0; i<arr.length; i++) { 
            if (!arr[i])
            return i+1;
        }
        return 0;
    }
}