/*Problem Statement : Given a positive integer n,
find the square root of n. If n is not a perfect square, then return the floor value.
Floor value of any number is the greatest Integer which is less than or equal to that number.
*/

public class SquareRoot {
    static int  floorSqrt(int n) {
        int ans = 0;
//        Brute force
//        for (int i = 1; i<n; i++){
//            if((i*i) <= n){
//                ans = i;
//            }
//        }
//        return ans;


//        optimal approach using binary search
        int start = 1 , end = n;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(mid <= n/mid){
                start = mid+1;
                ans = mid;
            }else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 81;
        System.out.println("Square root of "+n+" is : "+floorSqrt(n));
    }
}
