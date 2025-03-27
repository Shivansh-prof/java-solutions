// Problem statement

// Given a positive integer n, 
// The task is to find the value of Σi F(i) 
// where i is from 1 to n and function F(i) 
// is defined as the sum of all divisors of i.

class SumOfDivisorsV2 {
    public static int sumOfDivisors(int n) {

        int sumOfDivisor = 0;
        for (int i = 1; i <= n; i++) {
            sumOfDivisor += i; 
        }
        return sumOfDivisor;
    }

    public static void main(String[] args) {

        System.out.println("Sum of divisors is : "+ sumOfDivisors(6));
    }
}