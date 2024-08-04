class Solution {
    public String solution(String my_string, String alp) {
        
        StringBuilder answer = new StringBuilder();
        
        for (char c : my_string.toCharArray()) {
            if ( String.valueOf(c).equals(alp) ) {
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}