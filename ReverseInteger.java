// Problem statement


// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21


public class ReverseInteger {

    public int reverse(int x) {
        final int INT_MAX = 2147483647;
        final int INT_MIN = -2147483648;
        int reverse=0;
        boolean isNegative = (x < 0);
        x = Math.abs(x);

        while(x!=0){
            int num = x%10;
            if (reverse > (INT_MAX - num) / 10) {
                return 0; // Return 0 in case of overflow
            }
            reverse = reverse*10+num;
            x/=10;
        }
        if(isNegative){
            reverse = -reverse;
        }
        return reverse;
    }
    public static void main(String[] args) {
      int n=1234;
      reverse(n);
    }
}