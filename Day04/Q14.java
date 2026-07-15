//WAP to find nth term of a fibonacci series
import java.util.*;

public class Q14 {
       public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.print("Enter the nth term : ");
        int n = sc.nextInt();
        int a = 0 ;
        int b = 1 ;
        
        for(int i=2 ; i <= n ; i++) {
        a = a + b ;
        b = a + b ;

    }
    
      System.out.print("The nth term of the given number is : " + b);

}
}
