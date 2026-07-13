package Assignment.Day15;

//WAP to rotate array left
import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter how many digits to shift left: ");
        int k = scanner.nextInt();
        
        k = k % size; 
        
        for (int shift = 0; shift < k; shift++) {
            int firstElement = arr[0]; 
            
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1]; 
            }
            
            arr[size - 1] = firstElement; 
        }
        
        System.out.print("Array after " + k + " left shifts: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
