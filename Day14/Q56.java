public package Assignment.Day14;

//WAP to find dublicate
import java.util.Scanner;
public interface Q56 {

      public static void FindDublicates {
        
      }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int dub[] = new int[num];

        for(int i = 0; i<num ; i++) {
            System.out.print("Enter " + (i+1) + " of the array : ");
            arr[i] = sc.nextInt();
        }
 
       
     
        sc.close();
    }
}