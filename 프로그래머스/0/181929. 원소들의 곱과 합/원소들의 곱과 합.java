class Solution {
    public int solution(int[] num_list) {
        
        int s = 0;
        int m = 1;

        for (int num : num_list) {
            s += num;
            m *= num;
        }
        
        if ( m < (s * s) ) {
            return 1;
        } else {
            return 0;
        }
        
    }
}