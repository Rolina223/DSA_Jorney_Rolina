package Patterns;
import java.util.Scanner;

// Pattern 3 – Question 1
// Name: Inverted Right Angled Triangle
// Input: n = 4
// Output:
// ****
// ***
// **
// *
// Approach: Nested loops
// Time Complexity: O(n^2)

public class Pattern03_Q1_InvertedRightAngledTriangle {

    static void InvertedRightAngledTriangle(int n)
    {
        for(int i =1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        InvertedRightAngledTriangle(n);
        sc.close();
    }
}
