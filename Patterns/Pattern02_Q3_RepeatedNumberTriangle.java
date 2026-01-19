package Patterns;
import java.util.Scanner;

//Pattern_2 Qsn-3
//Repeated Number right angle traingle
//Input n =4
// 1
// 22
// 333
// 4444
// Approach: Nested loops
// Time Complexity: O(n^2)

public class Pattern02_Q3_RepeatedNumberTriangle {

    static void printRepeatedNumberTriangle(int n)
    {
        for(int i=1; i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

         public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRepeatedNumberTriangle(n);
        sc.close();

    }
    
}
