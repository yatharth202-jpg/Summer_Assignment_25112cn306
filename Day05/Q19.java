import java.util.*;

public class Q19 {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);

     //Taking input
     System.out.print("Enter a number : ");
     int n = sc.nextInt();
    
     //for 0 and 1 
    if( n<2) {

         System.out.print("The prime factors of this number is : " + n);
    
    } else {

     System.out.print("The prime factors of this number is : " + 1 + " ");
      
     for(int i = 2; i<=n ; i++) {

        //checking condions
        if(n%i == 0 && isPrime(i) == true) {
             System.out.print(i +" ");
        }

     }
    }  
       sc.close();
    }
    public static boolean isPrime(int n) {

        //for 0 and 1 
        if( n<2 ) {
          return false;
        }
        
        for(int i = 2; i< n ; i++) {
            if(n%i == 0) {
                return false;
            }
    }
    return true;
}
}

