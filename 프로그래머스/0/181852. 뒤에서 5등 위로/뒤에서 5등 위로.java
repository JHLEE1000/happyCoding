import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        Arrays.sort(num_list);
        
        int count = num_list.length - 5;
        
        int[] answer = new int[count];
        
        for (int i = 0; i < count; i++) {
            answer[i] = num_list[i + 5];
        }
        
        return answer;
    }
}