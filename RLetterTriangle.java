// Problem statement
// Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Reverse Letter Triangle.

// You must print a matrix corresponding to the given Reverse Letter Triangle.

// Example:
// Input: ‘N’ = 3

// Output: 

// A B C
// A B
// A


public class RLetterTriangle {
    public static void rLetterTriangle(int n) {
        // Write your code here
         for(int i='A'+n;i>'A';i--){
            for(char j='A';j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
      int n=3;
      rLetterTriangle(n);
    }
}