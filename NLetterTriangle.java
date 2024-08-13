// Problem statement
// Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Increasing Letter Triangle.

// Example:
// Input: ‘N’ = 3

// Output: 

// A
// A B
// A B C


public class NumberCrown {
    public static void numberCrown(int n) {
        // Write your code here
        for(int i='A';i<'A'+n;i++){
            for(char j='A';j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      int n=3;
      numberCrown(n);
    }
}