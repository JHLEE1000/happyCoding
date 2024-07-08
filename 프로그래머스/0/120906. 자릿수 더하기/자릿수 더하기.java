class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String numstr = Integer.toString(n);
        
        for (int i = 0; i < numstr.length(); i++) {
            answer += Character.getNumericValue(numstr.charAt(i));
        }
        
        
        return answer;
    }
}