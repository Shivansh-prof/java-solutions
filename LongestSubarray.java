import java.util.ArrayList;
import java.util.List;

public class LongestSubarray {
    public static int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int size  = 0;

        for(int i=0; i<n; i++){
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            int diff = k - nums[i];
            for(int j=i+1; j<n; j++){
                if(nums[j]<=diff){
                    list.add(nums[j]);
                    diff -=nums[j];
                    if(diff == 0){
                        size = Math.max(size, list.size());
                        break;
                    }
                }
            }
        }
        return size;
    }
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9 };
        int k = 15;
        System.out.println("Size of longest subarray with sum "+k+" is "+ longestSubarray(nums,k));

    }
}
