//Problem Statement: Given an array, we have to find the largest element in the array.

import java.util.Arrays;
public class LargestElement {
    public static int findLargestEmelentWithLoop(int[] nums) {
        int n = nums.length;
        int largest = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }
        return largest;
    }

    public static int findLargestEmelentWithSorting(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3, 9, 2, 8, 6};
        System.out.println("Largest Element via loop is : "
                + findLargestEmelentWithLoop(nums));
        System.out.println("Largest Element via sorting is : "
                + findLargestEmelentWithSorting(nums));

    }
}
