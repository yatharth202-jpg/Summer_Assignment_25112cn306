//WAP to genrate fibonacci series
import java.util.*;

public class Q13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.print("Enter the range : ");
        int n = sc.nextInt();
        int a = 0 ;
        int b = 1 ;
     
        System.out.print(a + " " + b +" ");
        
        for(int i=2 ; i <= n ; i++) {
        a = a + b ;
        b = a + b ;

        System.out.print(a + " " + b + " ");

        sc.close();
    }
}
}