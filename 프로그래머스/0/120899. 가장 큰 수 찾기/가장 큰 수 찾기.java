class Solution {
    public int[] solution(int[] array) {
                
        int x = array[0];
        int y = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > x) {
                x = array[i];
                y = i;
            }
        }
        
        return new int[]{x, y};
    }
}