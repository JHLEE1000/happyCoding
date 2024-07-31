class Solution {
    public int solution(String myString, String pat) {
        
        StringBuilder answer = new StringBuilder();
        
        for (char c : myString.toCharArray()) {
            if ( c == 'A') {
                answer.append('B');
            } else if ( c == 'B') {
                answer.append('A');
            }
        }
        
        if (answer.toString().contains(pat)) {
            return 1;
        } else {
            return 0;
        }
        
    }
}