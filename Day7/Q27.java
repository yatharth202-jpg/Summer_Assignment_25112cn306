//WAP to recursive sum of digits

import java.util.*;

public class Q27 {

    public static int SumOfDigits(int n) {
       //For negative number
        if(n < 0) {
            n = -n;
        } 
        //base case 
        if(n == 0) {
            return 0 ;
        }

        return (n%10) + SumOfDigits(n/10);
   }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

       int ans = SumOfDigits(n);

       System.out.print("Sum of digits is : " + ans);

       sc.close();

}
}
