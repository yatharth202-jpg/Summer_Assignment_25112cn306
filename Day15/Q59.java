package Assignment.Day15;

//WAP to rotate array right

 import java.util.Scanner;

public class Q59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter how many digits to shift right: ");
        int k = scanner.nextInt();
        
        k = k % size; 
        
        reverse(arr, 0, size - 1);    
        reverse(arr, 0, k - 1);      
        reverse(arr, k, size - 1);    
   
        System.out.print("Array after right shifts: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
    

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
