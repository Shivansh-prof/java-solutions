/*Problem Statement: You are given an integer array nums. You are initially positioned at the array's first index,
and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.*/

public class JumpGame {
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0;
        for (int i=0;i<n;i++){
            if (i>maxReach || nums[0] == 0){
                return false;
            }
            maxReach = Math.max(maxReach,i+nums[i]);
            if (maxReach>n){
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 0, 4};
        System.out.println(canJump(nums));

    }
}
