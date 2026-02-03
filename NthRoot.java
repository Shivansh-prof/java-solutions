/*Problem Statement : Given a positive integer n,
find the square root of n. If n is not a perfect square, then return the floor value.
Floor value of any number is the greatest Integer which is less than or equal to that number.
*/

public class NthRoot {
    static int  nthRoot(int n, int m) {
//        Brute Force
//        if (m == 0) return 0;
//        if (m == 1) return 1;
//        for (int i = 1; i <= m; i++) {
//            long power = 1;
//            for (int j = 0; j < n; j++) {
//                power *= i;
//                if(power > m){
//                    break;
//                }
//            }
//            if (power == m) {
//                return i;
//            }
//        }
//        return -1;


//        optimal approach using binary search
        if(m==0)
            return 0;
        if(m==1)
            return 1;
        int start = 1, end = m;
        while(start<=end){
            int mid = start + (end-start)/2;
            long power = 1;
            for(int i=0;i<n;i++){
                power*=mid;
                if(power>m)
                    break;
            }
            if (power == m)
                return mid;
            else if (power<m)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 3, m = 27;
        System.out.println(n+" root of "+m+" is : "+nthRoot(n,m));
    }
}
