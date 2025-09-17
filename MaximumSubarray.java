/*Problem Statement : Given an integer array nums, find the subarray with the largest sum, and return its sum.*/

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     int sum = 0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         max = Math.max(max,sum);
        //     }
        // }
        int sum = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, sum);
            if(sum<0)
                sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Sum of Maximum sub array is : "+ maxSubArray(nums));

    }
}
