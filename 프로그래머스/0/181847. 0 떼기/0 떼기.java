class Solution {
    public String solution(String n_str) {
        
        boolean leadingZero = true;
        StringBuilder answer = new StringBuilder();
        
        for (char c : n_str.toCharArray()) {
            if (leadingZero && c != '0') {
                leadingZero = false;
            }
            if (!leadingZero) {
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}