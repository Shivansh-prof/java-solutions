/*Problem Statement: We need to find whether the given integer array nums
 could represent a sorted array that has been rotated some number of times.
 A sorted array is defined as one arranged in non-decreasing order,
 meaning each element is less than or equal to the next.
 A rotation involves shifting a contiguous block of elements to the back of the array,
 preserving the relative order of all elements.*/

public class SortedAndRotated {
    public static boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        if(n<=1){
            return true;
        }
        for (int i=0; i<n; i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }

        return count <= 1;
    }


    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};

        System.out.println("Whether the array is sorted and rotated : "
                + check(nums));


    }
}
