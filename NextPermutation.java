/*Problem Statement : A permutation of an array of integers is an arrangement
of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr:
[1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically
greater permutation of its integer. More formally,
if all the permutations of the array are sorted in one container according to their lexicographical order,
then the next permutation of that array is the permutation that follows it in the sorted container.
If such arrangement is not possible, the array must be rearranged as the lowest possible order
(i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3]
because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
//    public static void nextPermutation(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        recursivePermutation(0,nums,result);
//        List<Integer> nextList = result.get(1);
//        for(int i = 0; i<nextList.size();i++){
//            nums[i] = nextList.get(i);
//        }
//
//    }
//    private static void recursivePermutation(int index,int[] nums,List<List<Integer>> result){
//        if(index == nums.length){
//            List<Integer> recPer = new ArrayList<>();
//            for(int num:nums){
//                recPer.add(num);
//            }
//            result.add(recPer);
//            return;
//        }
//        for(int i = index; i<nums.length;i++){
//            swap(i,index,nums);
//            recursivePermutation(index+1,nums,result);
//            swap(i,index,nums);
//        }
//
//    }


//    Optimal Solution
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverseArray(nums,0,n-1);
            return;
        }
        for(int i = n-1;i>index;i--){
            if(nums[i]>nums[index]){
                swap(i,index,nums);
                break;
            }
        }
        reverseArray(nums,index+1,n-1);

    }
    private static void reverseArray(int[] array,int start,int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
    private static void swap(int i, int j, int[] nums){
        int temp  = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,5,4,3,0,0};
        nextPermutation(nums);
        System.out.println("Array after rearranging : " + Arrays.toString(nums));

    }
}
