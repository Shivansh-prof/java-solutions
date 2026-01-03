/*Problem Statement : There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length)
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
(0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
You must decrease the overall operation steps as much as possible.
*/

public class SearchRotatedSortedArrayDuplicates {
    public static int searchRotatedSortedDuplicates(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while (low<=high){
            int mid  = (low + high ) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low +=1;
                high-=1;
            }
            if(nums [low]<= nums[mid]){
                if(nums[low] <= target && nums[mid]>= target){
                    high = mid-1;
                }else
                    low = mid+1;
            }else {
                if(nums[mid] <= target && nums[high]>= target){
                    low = mid+1;
                }else
                    high = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,6,3,7,0,1,2,3,3};
        int k = 0;
        System.out.println("found at index: "+searchRotatedSortedDuplicates(nums,k));
    }
}
