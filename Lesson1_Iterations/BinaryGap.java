class Solution {
    public int solution(int N) {
        int maxCount = 0; 
	int count = 0; 
	boolean flag = false;
	while(N>0) {
		if((N & 1) == 1) {
			if(flag) {
				maxCount=(maxCount>count) ? maxCount:count;
			}
			count=0;
			flag = true;
		}
		else {
			count++;
		}
		N >>= 1;
	}		
        return maxCount; 
    }
}
