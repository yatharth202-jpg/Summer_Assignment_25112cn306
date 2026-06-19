//WAP to Recursive fibonacci
import java.util.*;

public class Q26 {

    public static void printFibo(int a ,int b, int n) {
        if(n==0) {
            return ;
        }
        int c = a+b;
        System.out.print(c + " ");

        printFibo(b,c,n-1);

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int a = 0 , b = 1 ;

        System.out.print( "Fibonacci series is : " + a + " " + b + " ");
        
        printFibo(a,b,n+2);

}
}
