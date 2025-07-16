/*Problem Statement: You are given an array of integers,
your task is to move all the zeros in the array to the end of the array
and move non-negative integers to the front by maintaining their order. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {
    public static int[] moveZerosExtraArray(int[] nums, int n) {
        // brute force : using extra array
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp.add(nums[i]);
            }
        }
        int x = temp.size();
        for (int i = 0; i < x; i++) {
            nums[i] = temp.get(i);
        }
        for (int i = x; i < n; i++) {
            nums[i] = 0;
        }
        return nums;
    }

    public static int[] moveZerosTwoPointers(int[] nums, int n) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        if (j != -1) {
            for (int i = j + 1; i < n; i++) {
                if (nums[i] != 0) {
                    swap(nums, i, j);
                    j++;
                }
            }
        }
        return nums;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 0, 2, 5, 3, 0, 8, 0, 0, 7};
        int n = arr.length;
        System.out.println("Array after Moving zeros to the end using Extra Array " + Arrays.toString(moveZerosExtraArray(arr, n)));
        System.out.println("Array after Moving zeros to the end using Two Pointers " + Arrays.toString(moveZerosTwoPointers(arr, n)));
    }
}
