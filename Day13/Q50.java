package Assignment.Day13;

//WAP to find sum and average of array
import java.util.Scanner;

public class Q50 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int SumOfArray = 0 , AverageOfArray = 0 ;

        for(int i = 0; i<size ; i++) {
            System.out.print("Enter " + (i+1) + " of the array : ");
            arr[i] = sc.nextInt();
            SumOfArray += arr[i];
        }

        System.out.println("The sum of array is : " + SumOfArray);
        
        AverageOfArray = (SumOfArray / size);
        System.out.println("The average of array is : " + AverageOfArray);
       
        sc.close();
    }
}
