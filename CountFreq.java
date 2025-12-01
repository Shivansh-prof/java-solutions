import java.util.Arrays;

/*Problem Statement: Given a sorted array, arr[] and a number target,
you need to find the number of occurrences of target in arr[]. */
public class CountFreq {
    public static int countFreq(int[] nums, int target) {
        int firstOccur = findFirst(nums,target);
        int lastOccur = findLast(nums,target);
        if(firstOccur == -1)
            return 0;
        return lastOccur - firstOccur + 1;
    }
    public static int findFirst(int[] nums,int target){
        int first = -1;
        int start = 0, end = nums.length-1;
        while (start<=end){
            int mid = (start + end )/2;
            if(nums[mid] == target){
                first = mid;
                end = mid-1;
            }else if (nums[mid]<target){
                start = mid+1;
            }else {
                end = mid -1;
            }
        }
        return first;
    }
    public static int findLast(int[] nums,int target){
        int last = -1;
        int start = 0, end = nums.length-1;
        while (start<=end){
            int mid = (start + end )/2;
            if(nums[mid] == target){
                last = mid;
                start = mid+1;
            }else if (nums[mid]<target){
                start = mid+1;
            }else {
                end = mid -1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 2, 3};
        int target = 4;
        System.out.println("Number of occurrences of : "+target+" is : "+ countFreq(nums, target));
    }

}
