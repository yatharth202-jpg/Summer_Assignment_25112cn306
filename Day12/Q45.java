package Assignment.Day12;

//WAP to write function for palindrome
import java.util.Scanner;

public class Q45 {


    public static boolean IsPalendrome(int num) {
        int OriginalNum = num;
        int result = 0;

        while(num>0) {
    
        int digit = num % 10 ;

        result = result*10 + digit;

        num = num/10;
        }

        if(result == OriginalNum) {
            System.out.println("This number is a palendrome");
            return true;
        } else {
            System.out.println("This number is a palendrome");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        IsPalendrome(num);
        sc.close();
    }
}