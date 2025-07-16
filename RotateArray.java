import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RotateArray {
    public static int[] rotateExtraArray(int[] nums, int k, int n) {
        // brute force : using extra array
        int[] arr = new int[n];
        int j = 0;
        for(int i=n-k; i<n; i++){
            arr[j] = nums[i];
            j++;
        }
        for(int i=0; i<n-k; i++){
            arr[j] = nums[i];
            j++;
        }
        for(int i=0; i<n; i++){
            nums[i] = arr[i];
        }
        return nums;
    }
    public static void reverse(int[] nums, int start, int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    }
    public static int[] rotateReversal(int[] nums, int k, int n) {
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);

        return nums;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int k = 4;
        System.out.println("Array after rotating with k = "+k+" using Extra Array "+ Arrays.toString(rotateExtraArray(arr, k, n)));
        System.out.println("Array after rotating with k = "+k+" using reversal Method "+ Arrays.toString(rotateReversal(arr, k, n)));
    }
}
