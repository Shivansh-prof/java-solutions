import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] numberSumUptoTarget(int[] numbers, int target){

        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<numbers.length;i++){
            int diff = target - numbers[i];
            if(map.containsKey(diff)){
                return new int[]{diff,numbers[i]};
            }
            map.put(numbers[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] numbers = {1,4,5,6,9,2};
        int target = 5;
        int[] result = numberSumUptoTarget(numbers,target);
        System.out.println("Indexes of numbers that sum upto "+target +" is: "+Arrays.toString(result));
    }
}
