package Patterns;
import java.util.Scanner;

// Pattern 6 – Question 1
// Name: Binary Triangle Pattern
// Input: n = 4
// Output:
// 1
// 01
// 101
// 0101
// Approach: Alternating 0 and 1 in right-angled triangle
// Time Complexity: O(n^2)

public class Pattern06_Q1_BinaryTriangle
 {

    static void printBinaryTriangle(int n)
    {
       

        for (int i = 0; i <n; i++) {

            int start =1;

            if(i%2==1)
                start =0;

            for(int j =0;j<=i;j++)
            {
                System.out.print(start);
                start = 1-start;
            }

            System.out.println();
        }
    }

    public static void main(String []args)
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printBinaryTriangle(n);
            sc.close();
        }
    
}
