/*Problem Statement : You are given a sorted array consisting of only integers where every element appears exactly twice,
except for one element which appears exactly once.
Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.
*/

public class SingleNonDuplicateInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        int low = 1, high = n-2;

        while (low<=high){
            int mid = low + (high - low) / 2;
            if(nums[mid] != nums[mid-1]&&nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            if((mid %2 ==0 && nums[mid] == nums[mid+1])||(mid%2!=0 && nums[mid]==nums[mid-1])){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,5,5,6,6};
        System.out.println("single element in sorted array is : "+singleNonDuplicate(nums));
    }
}
