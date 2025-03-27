// Problem statement

// Given a positive integer n, 
// count the number of digits in n that 
// divide n evenly (i.e., without leaving a remainder). 
// Return the total number of such digits.

// A digit d of n divides n evenly 
// if the remainder when n is divided by d is 0 (n % d == 0).
// Digits of n should be checked individually. 
// If a digit is 0, it should be ignored because division by 0 is undefined.

class EvenlyDivides {
    public static int evenlyDivides(int n) {
        // code here
        int num = n;              
        int numberOfTimes = (int) Math.log10(n) + 1;
        int count = 0;
        for(int i=0 ; i<numberOfTimes ; i++){
            int rem = num % 10;   
            if(rem != 0 && n%rem == 0){
                count+=1;
            }
            num/=10;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Sum of divisors is : "+ evenlyDivides(2446));
    }
}