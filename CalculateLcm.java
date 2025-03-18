// Problem statement


// The least common multiple (LCM) of two integers a and b is the smallest positive integer that is divisible by both a and b. 
// In other words, the LCM of a and b is the smallest number that is a multiple of a and b.

// Example: If a is 6 and b is 8, the LCM of 6 and 8 is 24 because 24 is the smallest number that is a multiple of both 6 and 8.

public class CalculateLcm {

    public static int findLcm(int number1 , int number2){
        int max = Math.max(number1,number2);
        int min = Math.min(number1,number2);
        int lcm = max;
        while(true){
            boolean isLcm = lcm % min == 0;
            if(isLcm){
                return lcm;
            }
            lcm+=max;
        }
    }
    public static void main(String[] args) {
        System.out.print(findLcm(97,43));
    }
}