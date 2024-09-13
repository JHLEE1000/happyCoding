class Solution {
    public int[] solution(int[] arr, int k) {
        int count = arr.length;
        int[] answer = new int[count];
        
        for (int i = 0; i < count; i++) {
            if ( k % 2 == 0 ) {
                answer[i] = arr[i] + k; 
            } else {
                answer[i] = arr[i] * k;
            }
        }
        
        return answer;
    }
}