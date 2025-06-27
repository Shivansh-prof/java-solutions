import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void split(int[] nums, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        split(nums,low,mid);
        split(nums,mid+1,high);
        merge(nums,low,mid,high);
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        List temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right <= high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }else {
                temp.add(nums[right]);
                right++;
            }
        }
        while (left<=mid){
            temp.add(nums[left]);
            left++;
        }
        while (right<=high){
            temp.add(nums[right]);
            right++;
        }
        for(int i = low; i<=high;i++){
            nums[i]= (int) temp.get(i-low);
        }
    }

    public static int[] mergeSort(int[] nums) {
        int n = nums.length;
        split(nums,0,n-1);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3, 9, 2, 8, 6};
        System.out.println(Arrays.toString(mergeSort(nums)));

    }
}
