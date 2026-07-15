//WAP to recursive factorial
import java.util.*;

public class Q25 {

    public static int Factorial(int n) {
        if(n == 0 || n == 1) {
            return 1 ;
        }

        int fact = n*Factorial(n-1);
        return fact;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print("The factorial of the number is : " + Factorial(n) );
    }
}
