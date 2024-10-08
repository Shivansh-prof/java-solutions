// Problem statement


// Sam is researching on Alpha-Triangles. So, he needs to create them for different integers ‘N’.

// An Alpha-Triangle is represented by the triangular pattern of alphabets in reverse order.

// For every value of ‘N’, help sam to print the corresponding Alpha-Triangle.

// Example:
// Input: ‘N’ = 3

// Output: 
// C
// C B 
// C B A


public class AlphaTriangle {

    public static void alphaTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            char ch = (char)('A'+n-1);
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      int n=3;
      alphaTriangle(n);
    }
}