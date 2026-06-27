package Assignment.Day12;
//WAP to make a function which determine that the given number is a perfect number or not
import java.util.Scanner;

public class Q48 {
    public static boolean IsPerfect(int num) {
        int OriginalNumber = num;
        int sum = 0 ;

        while(num!=0) {
            num %= 10 ;
            sum += num ;
            num /= 10 ;
        }
        
        if(sum == OriginalNumber) {
            System.out.println("The number " + OriginalNumber + " is a perfect number");
            return true;
        } else {
            System.out.println("The number " + OriginalNumber + " is a not a perfect number");
            return false;
        }

    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
         
        IsPerfect(num);

        sc.close();
    }
}
