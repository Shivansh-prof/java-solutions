//Problem Statement: Check if given array is sorted.

import java.util.Arrays;

public class IsArraySorted {
    public static boolean isSorted(int[] nums) {
        int n = nums.length;
        if(n<=1){
            return true;
        }
        for (int i=1; i<n; i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3, 9, 2, 8, 6};

        System.out.println("Whether the array is sorted : "
                + isSorted(nums));


    }
}
