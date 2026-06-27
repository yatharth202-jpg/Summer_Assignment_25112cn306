package Assignment.Day11;

//WAP to write function to find maximum
import java.util.Scanner;

public class Q42 {
    public static int FindMaximum(int a,int b){
        if(a>b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();

        int c = FindMaximum(a, b);

        System.out.print("The maximum number is : " + c);
     
        sc.close();
    }
}
