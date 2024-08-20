// Problem statement
// Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Triangle.

// Example:
// Input: ‘N’ = 3

// Output: 

//   *
//  ***
// *****


public class NStarTriangle {
    public static void nStarTriangle(int n) {
        // Write your code here
    for(int i=0;i<n;i++){
        //spaces
        for(int j=0;j<(n-i-1);j++){
            System.out.print(" ");}
        //stars
        for(int j=0;j<(2*i+1);j++){
            System.out.print("*");}

        //spaces
        for(int j=0;j<(n-i-1);j++){
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
      int n=3;
      nStarTriangle(n);
    }
}