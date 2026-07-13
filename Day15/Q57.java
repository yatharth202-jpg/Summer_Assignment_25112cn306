package Assignment.Day15;

//WAP to reverse array
import java.util.*;
public class Q57 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array : ");
        int num = sc.nextInt();
        int arr1[] = new int[num];

        for(int i = 0; i<num ; i++) {
            System.out.print("Enter " + (i+1) + " of the array : ");
            arr1[i] = sc.nextInt();
        }

        int start = 0;
        int end = arr1.length - 1;
        
        while (start < end) {
            int temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;
            
            start++;
            end--;
        }
        
        System.out.print("Reverse of given array is : ");
           for(int i=0 ; i<num ; i++) {
            System.out.print(arr1[i] + " ");
        }
        sc.close();
}
}
