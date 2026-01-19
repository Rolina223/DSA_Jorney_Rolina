package Patterns;

import java.util.Scanner;

// Pattern 3 – Question 2
// Name: Inverted Number Right Angled Triangle
// Input: n =5 
// Output:
// 12345
// 1234
// 123
// 12
// 1
// Time Complexity: O(n^2)

public class Pattern03_Q2_InvertedNumberRightAngledTriangle {

    static void printInvertedNumberRightAngledTriangle(int n)
    {
        for(int i =n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInvertedNumberRightAngledTriangle(n);
        sc.close();
    }
    
}
