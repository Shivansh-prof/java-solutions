/*Problem Statement: Given an array nums containing n distinct numbers in the range [0, n], 
return the only number in the range that is missing from the array. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfNums = (n*(n+1))/2;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum+=nums[i];
        }
        return sumOfNums - sum;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,5,6,7,8,9};
        System.out.println("Missing Number in Array is : "+missingNumber(arr));
    }
}
