/*Problem Statement: Given a sorted array of distinct integers and a target value,
return the index if the target is found. If not,
return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity. */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] >= target){
                ans = mid;
                high = mid -1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6,9,11,12,13,20,23,26};
        int target = 15;
        System.out.println("Number Found or Should be at: "+searchInsert(nums,target));
    }

}
