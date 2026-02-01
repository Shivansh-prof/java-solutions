/*Problem Statement : Given an increasing sorted rotated array arr[] of distinct integers.
The array is right-rotated k times. Find the value of k.
Let's suppose we have an array arr[] = [2, 4, 6, 9], if we rotate it by 2 times it will look like this:
After 1st Rotation : [9, 2, 4, 6]
After 2nd Rotation : [6, 9, 2, 4]
*/

public class KthRotation {
    public static int findKRotation(int[] nums) {
        int low = 0, high = nums.length-1;
        while (low<high){
            int mid = low + (high - low) / 2;
            if(nums[mid]>nums[high]){
                low = mid+1;
            }else if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                high--;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println("array is rotated : "+findKRotation(nums)+" times.");
    }
}
