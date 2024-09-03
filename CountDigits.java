// Problem statement


// Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.

// Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.
 

// Examples :

// Input: n = 12
// Output: 2
// Explanation: 1, 2 when both divide 12 leaves remainder 0.


public class CountDigits {

    public static int evenlyDivides(int N){
        // code here
        int count=0;
        int num = N;
        while (N>0){
           int divisor = N % 10;
           if(divisor!=0 && num%divisor == 0){
               count++;
           }
          N/=10;
        }
        return count;
    }
    public static void main(String[] args) {
      int n=12;
      evenlyDivides(n);
    }
}