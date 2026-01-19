package Patterns;
import java.util.Scanner;

// Pattern 2 – Question 2
// Name: Number Right Angled Triangle
// Input: n = 4
// Output:
// 1
// 12
// 123
// 1234
// Approach: Nested loops
// Time Complexity: O(n^2)


public class Pattern02_Q2_NumberRightAngledTriangle {

    static void printNumberRightAngledTriangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumberRightAngledTriangle(n);

    }
    
}
