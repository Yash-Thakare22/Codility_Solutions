class Solution {
    public int solution(int[] A) {
        int count = 0;
        int passing  = 0;
        for (int i : A)
        {
            if (i == 1) {
                passing += count;
                if(passing > 1000000000)
                    return -1;
            }else
                count++;
        }
        return passing;
    }
}