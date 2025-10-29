/*Problem Statement - Given an array of integers nums and an integer k,
return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.*/

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count  = 0, sum = 0;
//        brute force method
//        for(int i=0; i<n; i++){
//            int  sum = 0;
//            for(int j = i; j<n; j++){
//                sum+=nums[j];
//                if(sum == k){
//                    count++;
//                }
//            }
//        }

//        Optimal Solution
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        for (int i = 0; i<n; i++){
            sum += nums[i];
            int diff = sum - k;
            count += mpp.getOrDefault(diff,0);
            mpp.put(sum,mpp.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println("total number of subarrays for sum "+k+" is: "+ subarraySum(nums,k));

    }
}
