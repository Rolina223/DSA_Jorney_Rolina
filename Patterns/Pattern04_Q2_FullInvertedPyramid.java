package Patterns;

import java.util.Scanner;

// Pattern 4 – Question 2
// Name: Inverted Full Pyramid Pattern
// Input: n = 4
// Output:
// *******
//  *****
//   ***
//    *
// Approach: Spaces + stars using nested loops
// Time Complexity: O(n^2)

public class Pattern04_Q2_FullInvertedPyramid {

    static void printInvertedFullPyramid(int n)
    {
        for(int i =0;i<n; i++)
        {

            //For left spaces
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
                //For number of star printing
            for (int j = 1; j <= (2 * n -1) - (2 * i); j++) {

                System.out.print("*");
                
            }
            //For right spaces
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }

            System.out.println();

        }
    }

     public static void main(String []args)
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printInvertedFullPyramid(n);
            sc.close();
        }
    
}
