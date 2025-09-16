/*Problem Statement : Given an array nums with n objects colored red, white, or blue.
        sort them in-place so that objects of the same color are adjacent,
        with the colors in the order red, white, and blue.

        We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.*/

import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int select = 0;
        for (int s = 0; s <= 2; s++) { // loop for select = 0, 1, 2
            for (int i = 0; i < n; i++) {
                if (nums[i] == s) {
                    int temp = nums[i];
                    nums[i] = nums[select];
                    nums[select] = temp;
                    select++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println("nums: "+ Arrays.toString(nums));
        sortColors(nums);
        System.out.println("After Sorting nums: "+Arrays.toString(nums));
    }
}
