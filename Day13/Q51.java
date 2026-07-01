package Assignment.Day13;

//WAP to find largest anf smallest element 
import java.util.Scanner;

public class Q51 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

          if (size <= 0) {
            System.out.println("Invalid array size. Please enter a value greater than 0.");
            sc.close();
            return;
        }

        int[] numbers = new int[size];

       System.out.println("Enter " + size + " integer elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println(lgst);
        int smallest = numbers[0];
        int largest = numbers[0];

           for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            } else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("The Largest element is: " + largest);
        System.out.println("The Smallest element is: " + smallest);

        sc.close();
    }
}