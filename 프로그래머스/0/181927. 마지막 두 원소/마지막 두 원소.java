class Solution {
    public int[] solution(int[] num_list) {
        
        int lastN = num_list[num_list.length - 1];
        int sLastN = num_list[num_list.length - 2];
        
        int[] answer = new int[num_list.length + 1];
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        if ( lastN > sLastN ) {
            answer[num_list.length] = lastN - sLastN;
        } else {
            answer[num_list.length] = lastN * 2;
        }
        
        return answer;
    }
}
