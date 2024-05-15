import java.util.*;

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        
        if ( b != 0) {
            System.out.println(a / b);
            System.out.println(a % b);    
        } else {
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println("0으로 나눌 수 없습니다.");
        }
        
    }
}