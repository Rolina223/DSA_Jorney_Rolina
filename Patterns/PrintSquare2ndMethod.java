package Patterns;
import java.util.Scanner;

// Pattern 1: Square
// Input: n
// Output: n x n square of '*'
// Approach: Static method + nested loops
// Time Complexity: O(n^2)

public class PrintSquare2ndMethod {

    static void printSquare(int n)
    {
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[]args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n =s.nextInt();
        printSquare(n);
    }
    
}
