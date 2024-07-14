class Solution {
    public int[] solution(int money) {
        
        int pricePerCup = 5500;
        int maxCups = money / pricePerCup;
        int remainingMoney = money % pricePerCup;
        
        int[] answer = {maxCups, remainingMoney};
        return answer;
    }
}