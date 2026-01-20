package Patterns;
import java.util.Scanner;

// Pattern 5 – Question 1
// Name: Double Right Angled Triangle
// Input: n = 5
// Output:
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
// Approach: Right angled triangle + inverted right angled triangle
// Time Complexity: O(n^2)

public class Pattern05_Q1_DoubleRightAngledTriangle{

    static void printHourglassPattern(int n)
    {


        //For ist half right angle trainled
        for(int i=1; i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }



        //For second half right angle trainled
        for(int i=1; i<=n;i++)
        {
            for(int j=1;j<n-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        //For second half inverted right angle traingled

     

    }

     public static void main(String []args)
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printHourglassPattern(n);
            sc.close();
        }
    
}


