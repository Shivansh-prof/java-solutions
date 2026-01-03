/*Problem Statement : There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length)
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target,
return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.
*/

public class SearchRotatedSortedArray {
    public static int searchRotatedSorted(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while (low<=high){
            int mid  = (low + high ) / 2;
            if(nums[mid] == target)
                return mid;
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
        int[] nums = {4,5,6,7,0,1,2};
        int k = 0;
        System.out.println("found at index: "+searchRotatedSorted(nums,k));
    }
}
