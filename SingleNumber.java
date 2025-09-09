import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumberUsingLinearSearch(int[] nums) {
        int n = nums.length;

//        Brute force approach using linear search
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == num)
                    count++;
            }
            if (count == 1)
                return num;
        }
        return -1;
    }
    public static int singleNumberUsingHashArray(int[] nums) {
        int n = nums.length;
        // Using Hash Array
        int mini = nums[0];
        int maxi = nums[0];

        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, nums[i]);
            maxi = Math.max(maxi, nums[i]);
        }

        int[] hash = new int[maxi - mini + 1];

        for (int i = 0; i < n; i++) {
                hash[nums[i] - mini]++;
        }

        for (int i = 0; i < n; i++) {
            if (hash[nums[i] - mini] == 1)
                return nums[i];
        }
        return -1;
    }
    public static int singleNumberUsingHashMap(int[] nums) {
        // using Hash map
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int value = map.getOrDefault(nums[i],0);
            map.put(nums[i],value + 1);
        }
        for(Map.Entry<Integer,Integer> check : map.entrySet()){
            if(check.getValue() == 1){
                return check.getKey();
            }
        }
        return -1;
    }
    public static int singleNumberUsingXor(int[] nums) {
        int n = nums.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ nums[i];
        }
        return xorr;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,6,6,7,7,3,4,9,4,9};
        System.out.println("Number Occurring only once is "+ singleNumberUsingLinearSearch(nums));
        System.out.println("Number Occurring only once is "+ singleNumberUsingHashArray(nums));
        System.out.println("Number Occurring only once is "+ singleNumberUsingHashMap(nums));
        System.out.println("Number Occurring only once is "+ singleNumberUsingXor(nums));
    }
}
