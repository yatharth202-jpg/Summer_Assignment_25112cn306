package Assignment.Day14;

//WAP to find second largest element
import java.util.Scanner;
public interface Q55 {

       public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE; 
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        if (size < 2) {
            System.out.println("Array must contain at least 2 elements to find the second largest.");
            sc.close();
            return;
        }

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int result = findSecondLargest(numbers);

        if (result == Integer.MIN_VALUE) {
            System.out.println("All entered elements are identical. No unique second-largest element exists.");
        } else {
            System.out.println("The second largest element is: " + result);
        }

        sc.close();
    }
}