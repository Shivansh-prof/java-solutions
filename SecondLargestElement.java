//Problem Statement: Given an array, find the second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

import java.util.Arrays;

public class SecondLargestElement {
//    Solution 1: (Brute Force) [this approach only works if there are no duplicates]
    public static int findSecondLargestElementWithSorting(int[] nums){
        if(nums.length == 0 || nums.length == 1){
            return -1;
        }
        Arrays.sort(nums);
        return nums[nums.length-2];
    }
//    Solution 3(Best Solution)
    public static int findSecondLargestElementWithLoop(int[] nums) {
        int n = nums.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>largest){
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i]>secondLargest  && nums[i]!=largest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }



    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3, 9, 2, 8, 6};
        System.out.println("Second Largest Element via loop is : "
                + findSecondLargestElementWithLoop(nums));
        System.out.println("Second Largest Element via sorting is : "
                + findSecondLargestElementWithSorting(nums));

    }
}
