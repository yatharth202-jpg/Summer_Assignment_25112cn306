package Assignment.Day11;

//WAP to write function to find sum of two numbers
import java.util.Scanner;

public class Q41 {

    public static int AddTwofNumber(int a,int b,int sum) {
        return  sum = a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();

        System.out.print("Enter 1st number : ");
        int b = sc.nextInt();
        
        int sum = AddTwofNumber(a, b,0);

        System.out.print("the sum of " + a + " and " +b+ " is : " + sum);
      
        sc.close();
    }
}
