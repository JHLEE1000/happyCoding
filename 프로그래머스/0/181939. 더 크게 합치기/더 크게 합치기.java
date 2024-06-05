class Solution {
    public int solution(int a, int b) {
        
        // a와 b를 이어붙인 값과 b와 a를 이어붙인 값을 생성
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        int answer = 0;
        
        // 둘 중 더 큰 값을 answer에 저장
        if (ab > ba) {
            answer = ab;
        } else {
            answer = ba;
        }
        
        return answer;
    }
}