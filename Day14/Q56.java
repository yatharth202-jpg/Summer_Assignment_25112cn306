package Assignment.Day14;

//WAP to find dublicate
import java.util.*;

public class Q56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        Arrays.sort(numbers);
        
        System.out.print("Duplicate elements: ");
        boolean foundDuplicate = false;
        
        for (int i = 0; i < numbers.length - 1; i++) {
  
            if (numbers[i] == numbers[i + 1]) {
                System.out.print(numbers[i] + " ");
                foundDuplicate = true;
                
                while (i < numbers.length - 1 && numbers[i] == numbers[i + 1]) {
                    i++;
                }
            }
        }
        
        if (!foundDuplicate) {
            System.out.print("None");
        }
        System.out.println();
        
        scanner.close();
    }
}