/*Problem Statement - You're given an sorted array arr of n integers and an integer x.
Find the floor and ceiling of x in arr[0..n-1].
The floor of x is the largest element in the array which is smaller than or equal to x.
The ceiling of x is the smallest element in the array greater than or equal to x.*/


public class FloorAndCeil {
    public static int findFloor(int[] nums, int target) {
        int ans = -1;
        int low = 0, high = nums.length-1;
        while (low <= high){
            int mid = (low + high)/2;
            if(nums[mid]<=target){
                ans = mid;
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static int findCeil(int[] nums, int target) {
        int ans = -1;
        int low = 0, high = nums.length-1;
        while (low <= high){
            int mid = (low + high)/2;
            if(nums[mid]>=target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 8, 10, 10, 12, 19};
        int k = 5;
        System.out.println("Floor of "+k+" is: "+findFloor(nums,k)+" and Ceil of "+k+" is: "+findCeil(nums,k));

    }
}

