import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        
        x = sc.nextInt();
        y = sc.nextInt();
        
        sc.close();
        
        if (x > 0) {
            if (y > 0) {
                System.out.print(1);
            } else {
                System.out.print(4);
            }
        } else {
            if (y > 0) {
                System.out.print(2);
            } else {
                System.out.print(3);
            }
        }
    }
}