//Write a program to check the given number is an Armstrong number or not
import java.util.*;

public class Q15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;
        int result = 0;

        //Counting the digits
        int OriNum = num;
        while(num != 0) {
            num /= 10;
            count++;   
        }

        //checking for armstrong number
           num = OriNum;
        while(num != 0) {
           int rem = num%10 ;
            result += Math.pow(rem,count);
            num /= 10;
        }

        //output
          num = OriNum;
        if(result == num) {
            System.out.print("The given number is an armstrong number");
        } else {
            System.out.print("The given number is not an armstrong number");
        }
    }
    
}