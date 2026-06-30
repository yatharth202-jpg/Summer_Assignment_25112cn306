package Assignment.Day13;

//WAP to program to count even and odd elements
import java.util.Scanner;

public class Q52 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int countEven = 0 , countOdd = 0;

            for(int i = 0; i<num ; i++) {
            System.out.print("Enter " + (i+1) + " of the array : ");
            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("The total Even elements are : " + countEven);
        System.out.println("The total Odd elements are : " + countOdd);
       
        sc.close();
    }
}
    