class Solution {
    public String[] solution(String[] names) {
        
        int count = (int) Math.ceil(names.length / 5.0 );
        String[] answer = new String[count];
        
        for (int i = 0; i < count; i++) {
            answer[i] = names[i * 5];
        }
        
        return answer;
    }
}