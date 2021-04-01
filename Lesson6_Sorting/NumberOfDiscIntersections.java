class Solution {
    public static int solution(int[] A) {
    	final int MAX_INTERSECTIONS = 10000000;
    	int N = A.length;
    	int [] discStartPoint = new int [N];
    	int [] discEndPoint = new int [N];		
    	for (int i = 0; i < N; i++) { 
    		discStartPoint[i] = i - A[i];    		    		
    		if (Integer.MAX_VALUE - A[i] < i) 
    		{
    			discEndPoint[i] = Integer.MAX_VALUE;    			
    		}
    		else
    		{                    
    			discEndPoint[i] = i + A[i];
    		}
    	}
    	Arrays.sort(discStartPoint);
    	Arrays.sort(discEndPoint);
 
    	int startPointIndex= 0;
    	int endPointIndex = 0;
    	int openDiscs = 0;
    	int intersections = 0;
    	while(startPointIndex < N) {
    		if (discStartPoint[startPointIndex] <= discEndPoint[endPointIndex]) 
    		{
                intersections = intersections + openDiscs; 
                if (intersections > MAX_INTERSECTIONS) 
                {
                	return -1;
                }
                openDiscs++;
                startPointIndex++;
    		}
    		else {
    			openDiscs--;
                endPointIndex++;
            }
    	}
    	return intersections;
    }
}