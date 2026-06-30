package Assignment.Day14;

//WAP to Frequency of an element
import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid size. Array must contain elements.");
            sc.close();
            return;
        }

        int[] numbers = new int[size];
        boolean[] visited = new boolean[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\n--- Element Frequencies ---");
        for (int i = 0; i < size; i++) {
             if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    visited[j] = true; 
                }
            }

             System.out.println("Element " + numbers[i] + " occurs: " + count + " time(s)");
        }

        sc.close();
    }
}