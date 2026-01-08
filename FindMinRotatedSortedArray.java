/*Problem Statement : Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.
*/

public class FindMinRotatedSortedArray {
    public static int findMin(int[] nums) {
        int low = 0, high = nums.length-1,min = Integer.MAX_VALUE;
        while (low<=high){
            int mid = (low+high)/2;
            if(nums[low]<=nums[mid]){
                //left half of rotated array is sorted

                min = Integer.min(min,nums[low]);
                low = mid+1;
            }
            else{
                //right half of rotated array is sorted
                min = Integer.min(min,nums[mid]);
                high = mid-1;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println("minimum element: "+findMin(nums));
    }
}
