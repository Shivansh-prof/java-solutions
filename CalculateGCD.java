// Problem statement


/**
     * Calculates and returns the greatest common divisor (GCD) of the two numbers.
     * Edge case: If either number is negative, returns 1 as the GCD for negative numbers is 1.
     * Edge case: If either number is zero, returns 0 as the GCD of 0 and any other number is 0.
     * Edge case: If two numbers are equal, returns the number as the GCD of two equal numbers is the number itself.
     * @return GCD of the two numbers, or 1 if either number is negative, or 0 if either number is zero.
*/

public class CalculateGCD {

    public static int findGcd(int number1 , int number2) {
        // Write your code here
        if(number1 < 0 || number2 < 0){
            return 1;
        }
        if(number1 == 0 || number2 == 0){
            return 0;
        }
        if(number1 == number2){
            return number1;
        }
        
        int min = Math.min(number1,number2);
        int gcd = min;
        
        for(int i = min ; i > 0 ; i--){
            boolean isGcd = number1 % i == 0 && number2 % i == 0;
            if(isGcd){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.print(findGcd(97,43));
    }
} 