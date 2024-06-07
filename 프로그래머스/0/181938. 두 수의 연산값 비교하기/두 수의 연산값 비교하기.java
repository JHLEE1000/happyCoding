class Solution {
    public int solution(int a, int b) {
        
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int twoab = 2*a*b;
        
        int answer = 0;
        
        if (ab >= twoab) {
            answer = ab;
        } else {
            answer = twoab;
        }
        
        return answer;
    }
}