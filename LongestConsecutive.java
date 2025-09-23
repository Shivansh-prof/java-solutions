/*
    Problem Statement: Given an unsorted array of integers nums,
    return the length of the longest consecutive elements sequence.
    You must write an algorithm that runs in O(n) time.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static int longestConsecutiveUsingLinearSearch(int[] nums) {
        int longestCount = 1;
        for (int j : nums) {
            int num = j;
            int count = 1;
            while (true) {
                boolean found = false;
                for (int k : nums) {
                    if (k == num + 1) {
                        num++;
                        count++;
                        found = true;
                        break;
                    }
                }
                if (!found) break;
            }
            longestCount = Math.max(longestCount, count);
        }
        return longestCount;
    }
    public static int longestConsecutiveUsingSorting(int[] nums){
        int longest = 1;
        Arrays.sort(nums);
        int lastSmall = Integer.MIN_VALUE;
        int count = 0;
        for (int num : nums) {
            if (num - 1 == lastSmall) {
                count++;
                lastSmall = num;
            } else if (num != lastSmall) {
                count = 1;
                lastSmall = num;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    public static int longestConsecutiveUsingSets(int[] nums){
        int longest = 1;
        Set<Integer> consSet = new HashSet<>();
        for(int num : nums){
            consSet.add(num);
        }
        for(int num : consSet){
            if(!consSet.contains(num - 1)){
                int count = 1;
                int x = num;
                while (consSet.contains(x+1)){
                    count++;
                    x++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }



    public static void main(String[] args) {
        int[] nums = {3,8, 5, 7, 6 };
        System.out.println("Longest consecutive subsequence using Linear search is : "+longestConsecutiveUsingLinearSearch(nums));
        System.out.println("Longest consecutive subsequence using sorting is : "+longestConsecutiveUsingSorting(nums));
        System.out.println("Longest consecutive subsequence using Set is : "+longestConsecutiveUsingSets(nums));
    }
}
