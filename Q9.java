//WAP to check whether a number is prime
import java.util.*;

public class Q9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        //Taking input
    System.out.print("Enter a number : ");

    int num = sc.nextInt();
    int count = 0 ;

//checking the condition of given number is 1 or less then 1 

if(num <1) {

    System.out.print("Given number is not a prime number");

} else if(num == 1) {
    
    System.out.print("1 is not a prime nor composite number");

} else {

     for(int i=2 ; i<num/2 ; i++) {
        
        if(num%i == 0 ) {
            count++;
          }
        } 

        if(count == 0) {
            System.out.print("The given number is a prime number");
        } else {
            System.out.print("The given number is not a prime number");
        }
    
      }
}
}
