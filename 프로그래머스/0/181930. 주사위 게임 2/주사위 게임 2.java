class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int s = a + b + c;
        int d = (a*a)+(b*b)+(c*c);
        int t = (a*a*a)+(b*b*b)+(c*c*c);
        
        if ( a == b && b == c ) {
            answer = s * d * t;
        } else if ( a == b || a == c || b == c ) {
            answer = s * d;
        } else {
            answer = s;
        }
        
        return answer;
    }
}