class Solution {
    public int solution(int[] num_list) {

        String odd = "";
        String even = "";
        
        for (int n : num_list) {
            if(n % 2 == 0) {
                even += n;
            } else {
                odd += n;
            }
        }
        
        int evenNum = even.length() > 0 ? Integer.parseInt(even) : 0;
        int oddNum = odd.length() > 0 ? Integer.parseInt(odd) : 0;
        
        return evenNum + oddNum;
             
    }
}