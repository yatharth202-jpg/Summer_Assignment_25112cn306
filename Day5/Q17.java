//WAP to check given number is a perfect number or not
import java.util.*;

public class Q17 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Taking input from the user
        System.out.print("Enter a number : ");

        int n = sc.nextInt();
        int OriginalNum = n ;
        int sum = 0 ;

        //seprating digits and calculation
        while(n > 0) {
            n %= 10;
            sum += n;
            n /= 10;
        }

        //Printing output
        if(sum == OriginalNum) {
             System.out.print("The given number " + OriginalNum + " is a perfect number");
          } else {
            System.out.print("The given number " + OriginalNum + " is not a perfect number");
          }
    }
}
