/*Problem Statement : You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArray {
    public static int[] rearrangeArray(int[] nums) {
//        Using 2 extra arrays
//        List<Integer> positive = new ArrayList<>();
//        List<Integer> negative = new ArrayList<>();
//        for(int num : nums){
//            if(num>0)
//                positive.add(num);
//            else
//                negative.add(num);
//        }
//        for(int i = 0; i<nums.length/2;i++){
//            nums[2*i] = positive.get(i);
//            nums[2*i+1] = negative.get(i);
//        }

//        using single extra array
        int[] result = new int[nums.length];
        int posIndex = 0,negIndex = 1;
        for(int num : nums){
            if(num>0){
                result[posIndex] = num;
                posIndex+=2;
            }else{
                result[negIndex] = num;
                negIndex+=2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println("Array after rearranging : "+ Arrays.toString(rearrangeArray(nums)));

    }
}
