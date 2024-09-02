import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        Set<Integer> deleteSet = new HashSet<>();
        for (int num : delete_list) {
            deleteSet.add(num);
        }
        
        List<Integer> answerList = new ArrayList<>();
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                answerList.add(num);
            }
        }
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}