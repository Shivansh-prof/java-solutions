import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<n-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3};
        System.out.println(Arrays.toString(bubbleSort(nums)));

    }
}
