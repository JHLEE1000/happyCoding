import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        
        sc.close();
        
        if ( s >= 90 && s <= 100 ) {
            System.out.println("A");
        } else if ( s >= 80 && s < 90 ) {
            System.out.println("B");
        } else if ( s >= 70 && s < 80 ) {
            System.out.println("C");
        } else if ( s >= 60 && s < 70 ) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}