public class Solution {

    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            String currentString = my_strings[i];
            int start = parts[i][0];
            int end = parts[i][1];

            answer.append(currentString.substring(start, end + 1));
        }

        return answer.toString();
    }
}