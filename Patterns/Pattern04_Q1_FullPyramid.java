    package Patterns;

    import java.util.Scanner;

// Pattern 4 – Question 1
// Name: Full Pyramid Pattern (Stars)
// Input: n = 4
// Output:
//    *
//   ***
//  *****
// *******
// Approach: Spaces + stars using nested loops
// Time Complexity: O(n^2)

    public class Pattern04_Q1_FullPyramid {

        static void printFullPyramid(int n)
        {
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
            
        }



        public static void main(String []args)
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printFullPyramid(n);
            sc.close();
        }
        
        
    }
