package Assignment.Day14;

//WAP to linear search
import java.util.Scanner;
public interface Q53 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i = 0; i<num ; i++) {
            System.out.print("Enter " + (i+1) + " of the array : ");
            arr[i] = sc.nextInt();
        }
 
       System.out.print("Enter a number to search : ");
       int x = sc.nextInt();

       for(int i = 0; i<num ; i++) {
          if( x == arr[i] ) {
            System.out.print("Number " + x + " is found at index " + arr[i] + " ");
          }
       }
     
        sc.close();
    }
}
