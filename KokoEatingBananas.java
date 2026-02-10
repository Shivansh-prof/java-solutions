/*Problem Statement: Koko loves to eat bananas. There are n piles of bananas,
the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile.
If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.
*/
import java.util.Arrays;

public class KokoEatingBananas {

    public static int findLargestElement(int[] piles){
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findLargestElement(piles);
//        Brute Force : Using loop to find k
//
//        for (int i = low;i<=high;i++){
//            int reqTime = calculateTime(piles,i);
//            if(reqTime <= h){
//                k = i;
//            }
//        }

//        Optimal Solution : using binary search to find k
        while(low<high){
            int mid = low + (high - low) / 2;
            int reqTime = calculateTime(piles,mid);
            if(reqTime<=h){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    public static int calculateTime(int[] piles, int eatingSpeed){
        int totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + eatingSpeed - 1) / eatingSpeed;
        }
        return totalHours;
    }
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h  = 8;
        System.out.println("minimum eating speed koko needs : "
                + minEatingSpeed(piles,h)+" per hour.");

    }
}
