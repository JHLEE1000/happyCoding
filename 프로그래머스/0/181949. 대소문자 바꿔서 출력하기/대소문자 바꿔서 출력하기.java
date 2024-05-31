import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            
            if(Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c); 
            } else {
                answer += Character.toLowerCase(c);
            }
        }
        System.out.print(answer);
    }
}