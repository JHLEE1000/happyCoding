import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        char[] charArray = str.toCharArray();
        
        for (char c : charArray) {
            System.out.println(c);
        }
    }
}