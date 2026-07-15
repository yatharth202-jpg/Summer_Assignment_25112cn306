//WAP to find x^n 
import java.util.*;

public class Q24 {
    public static int FindPower(int x , int n) {
        if(x==1 || n==0) {
            return 1;
        } if(x == 0) {
            return 0;
        }  

        if(n % 2 == 0) {
            //for even power
        int pow = FindPower(x,n/2)*FindPower(x,n/2);
        return pow;
        } else {
            //for odd power
         int pow = FindPower(x,n/2)*FindPower(x,n/2)*x;
         return pow;
             }
      }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int x = sc.nextInt();

        System.out.print("Enter the power : ");
        int n = sc.nextInt();
        
        System.out.print("Enter the power of " + x +" to the power " + n + " is : " +  FindPower(x,n));
        
        sc.close();
    }
}