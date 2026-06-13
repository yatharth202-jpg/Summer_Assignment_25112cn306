//Write a program to find factoral of a number

import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

 //input
      System.out.print("Enter a numbers : ");

        int n = sc.nextInt();

//checking condition
    
    if ( n <= 0) {
        System.out.println("Invalid input") ;
    } 

     else {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
                fact *= i;
            }
  //output
      System.out.println("Factorial is : " + fact);
           }
        }
    }
