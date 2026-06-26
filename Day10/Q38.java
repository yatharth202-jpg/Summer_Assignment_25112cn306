package Assignment.Day10;
/*
WAP to print pattern
  *******
   *****
    ***
     *
 */
import java.util.Scanner;
public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (rows - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    sc.close();
 }
}
