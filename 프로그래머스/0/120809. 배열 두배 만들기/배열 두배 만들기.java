class Solution {
    public int[] solution(int[] numbers) {
        
        int len = numbers.length;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            answer[i] = 2 * numbers[i];
        }
        
        
        return answer;
    }
}