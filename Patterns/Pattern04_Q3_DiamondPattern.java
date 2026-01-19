package Patterns;

import java.util.Scanner;

// Pattern 4 – Question 3
// Name: Diamond Pattern (Stars)
// Input: n = 4
// Output:
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *

public class Pattern04_Q3_DiamondPattern {

    static void printDiamondPattern(int n)
    {
        //Upper half full pyraimd
        for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n-i;j++)

                {
                    System.out.print(" ");
                }

                for(int j=1; j<= 2*i - 1; j++)
                {
                    System.out.print("*");
                }
                for( int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                System.out.println();
            }

            //Lower half inverted full pyraimd
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
            printDiamondPattern(n);
            sc.close();
        }
    
}
