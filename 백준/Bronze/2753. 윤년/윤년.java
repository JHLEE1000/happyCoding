import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        
        y = sc.nextInt();
        sc.close();

        if(y%4==0) {
            if(y%400==0) System.out.print(1);
            else if(y%100==0) System.out.print(0);
            else System.out.print(1);
        } 
        else System.out.print(0);
        
//        if ( y % 4 == 0 && (y % 100 != 0 || y % 400 == 0) ) { 
//            System.out.print( 1 ); 
//        } else {
//            System.out.print( 0 );
//        }
    
    }
}