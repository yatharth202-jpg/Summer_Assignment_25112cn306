//Write a program to print multiplication table of a given number

import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //input
      System.out.print("Enter a numbers : ");

        int a = sc.nextInt();

        for(int i = 1 ; i<=10 ; i++) {

            int mul = a*i ;

       //output
      System.out.println( a + " * " + i + " = " + mul);

        }
    }
}

