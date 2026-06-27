package Assignment.Day11;

//WAP to write function to find factorial
import java.util.Scanner;

public class Q44 {

    public static int FindFactorial(int n) {
        if(n <=1) {
            return 1;
        }

        int result = FindFactorial(n-1) * n;
        return result;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print("Factorial of "+ n + " is : " + FindFactorial(n) );
        sc.close();
    }
}
