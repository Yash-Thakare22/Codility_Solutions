class Solution {
    public int solution(int X, int[] A) {
        int minTime = X;
        boolean[] leaves = new boolean[minTime+1];
        for(int i = 0; i < A.length; i++){
            if(!leaves[A[i]]){
                leaves[A[i]] = true;
                steps--;
                if(minTime == 0) 
                    return i;
            }
        }
        return -1;
    }
}

//2nd solution
class Solution {
    public int solution(int X, int[] A) {
        Set<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<A.length;i++)
        {
            hs.add(A[i]);
            if(hs.size()==X)
            {
                return i;
            }
        }
        return -1;
    }
}