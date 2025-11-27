import java.util.Arrays;

/*Problem Statement: Given an array of integers nums sorted in non-decreasing order,
find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity. */
public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans  = new int[2];
        ans[0] = findFirst(nums,target);
        ans[1] = findLast(nums,target);
        return ans;
    }
    public static int findFirst(int[] arr, int target){
        int first = -1;
        int start = 0, end = arr.length - 1;
        while (start<=end){
            int mid = (start + end )/2;
            if(arr[mid] == target){
                first = mid;
                end = mid-1;
            } else if (arr[mid]<target) {
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        return first;
    }
    public static int findLast(int[] arr, int target){
        int last = -1;
        int start = 0, end = arr.length - 1;
        while (start<=end){
            int mid = (start + end )/2;
            if(arr[mid] == target){
                last = mid;
                start = mid+1;
            } else if (arr[mid]<target) {
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,10};
        int target = 8;
        System.out.println("Number Found or Should be at: "+ Arrays.toString(searchRange(nums, target)));
    }

}
