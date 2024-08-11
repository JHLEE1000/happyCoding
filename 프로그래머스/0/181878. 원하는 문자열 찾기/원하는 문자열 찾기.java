class Solution {
    public int solution(String myString, String pat) {
        
        String lmys = myString.toLowerCase();
        String lpat = pat.toLowerCase();
        
        if (lmys.contains(lpat)) {
            return 1;
        } else {
            return 0;
        }
    }
}