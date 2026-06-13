//Write a program to find product of digits
import java.util.*;

public class Q7 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        //input
    System.out.print("Enter a number : ");

    int n = sc.nextInt();
    int pro = 1;

    while(n!=0) {

        int temp = n % 10 ;

        //muliplication of digit 
       pro = pro*temp;

        //Reducing the digits
        n = n/10;
        
    }
    //output
    System.out.print("The product of the digit of given number is : "+ pro);

    }
}
