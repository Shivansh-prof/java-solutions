import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] nums) {
        int n = nums.length;

        for(int i=0;i<n-1;i++){
            int min = i;
            for (int j=i;j<n;j++){
                if(nums[j]<nums[min]){
                    int temp = nums[min];
                    nums[min] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {7, 4, 1, 5, 3, 9, 2, 8, 6};
        System.out.println(Arrays.toString(selectionSort(nums)));

    }
}
