import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static int partition(List<Integer> nums,int low, int high){
        int pivot = nums.get(low);
        int i = low;
        int j = high;
        while (i<j){
            while (nums.get(i)<=pivot && i<=high-1){
                i++;
            }
            while (nums.get(j)>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                swap(nums,i,j);
            }
        }
        swap(nums,low,j);
        return j;
    }

    private static void swap(List<Integer> nums, int i, int j) {
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }

    public static void quickSort(List<Integer> nums,int low, int high){
        if(low<high){
            int pIndex = partition(nums,low,high);
            quickSort(nums,low,pIndex-1);
            quickSort(nums,pIndex+1,high);
        }
    }

    public static List<Integer> quick(List<Integer> nums) {
        int n = nums.size();
        quickSort(nums,0,n-1);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(7, 4, 1, 5, 3 , 9, 2, 8, 6);
        System.out.println("unsorted list : ");
        nums.stream().forEach(n -> System.out.print(n+" "));
        System.out.println("\nSorted List: ");
        quick(nums).forEach(n -> System.out.print(n + " "));

    }
}
