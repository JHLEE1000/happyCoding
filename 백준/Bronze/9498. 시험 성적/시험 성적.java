import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        
        sc.close();
        
        //삼항연산자 사용
        System.out.println((s>=90)?"A":(s>=80)?"B":(s>=70)?"C":(s>=60)?"D":"F");
        
/**        if ( s >= 90 && s <= 100 ) {
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
**/
    }
}