package Assignment.Day13;

//WAP to input and display array
import java.util.Scanner;

public class Q49 {

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i = 0; i<num ; i++) {
            System.out.print("Enter " + (i+1) + " of the array : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The Entered array is : ");
         for(int i = 0; i<num ; i++) {
            System.out.print(arr[i] + " ");
        }
     
        sc.close();
    }
}
