package Assignment.Day12;

//WAP to make a function to check number is Armstrong or not
import java.util.Scanner;

public class Q46 {
      public static boolean IsArmstrong(int num){
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
            return true;
        } else {
            System.out.print("The given number is not an armstrong number");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
         
        IsArmstrong(num);

        sc.close();
    }
}
