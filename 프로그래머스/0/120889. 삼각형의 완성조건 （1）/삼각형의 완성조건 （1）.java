class Solution {
    public int solution(int[] sides) {
        
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];
        
        int max = Math.max(a, Math.max(b, c));
        
        int sum = a + b + c - max;
        
        if (max < sum) {
            return 1;
        } else {
            return 2;
        }
    }
}