// Problem statement


// Sam is curious about symmetric patterns, so he decided to create one.

// For every value of ‘N’, return the symmetry as shown in the example.

// Example:
// Input: ‘N’ = 3

// Output: 
// *         *
// * *     * *
// * * * * * *
// * *     * *
// *         *


public class Symmetry {

    public static void symmetry(int n) {
        // Write your code here
        int spaces = 2*n-2;
        for(int i = 1;i<=2*n-1;i++){
            int stars = i;
            if(i>n){
                stars = 2*n -i;
            }
            // stars
            for(int j = 1 ; j<=stars ; j++){
                System.out.print("* ");
            }
            // spaces 
            for(int j = 1 ; j<=spaces ; j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1 ; j<=stars ; j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<n){
                spaces-=2;
            }else{
                spaces+=2;
            }
        }
        
    }
    public static void main(String[] args) {
      int n=3;
      symmetry(n);
    }
}