package Patterns;
import java.util.Scanner;

// Pattern 2: Right Angled Triangle
// Input: n
// Output: Right Angled Triangle of height n
// Approach: Static method + nested loops
// Time Complexity: O(n^2)

public class Pattern02_Q1_RightAngledTriangle {

    static void printRightAnglTriangle(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        printRightAnglTriangle(n);

    }
    
}
