//Write a program to Count digit of a number
import java.util.*;

public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //input
      System.out.println("Enter a numbers : ");

        int n = sc.nextInt();
        int count = 0 ;
     
        while (n > 0) {
      
          n = n/10 ;
          count++ ;

    }
    //output
   System.out.println("Digit Count of giving number is : " + count);
    }
}