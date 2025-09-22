/*
    Problem Statement: Given an array, print all the elements which are leaders.
    A Leader is an element that is greater than all of the elements on its right side in the array.
*/
import java.util.ArrayList;
import java.util.List;

public class LeaderElement {
    public static List<Integer> findLeaderUsingTwoLoops(int[] nums){
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            boolean leader = true;
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]<nums[j]){
                    leader = false;
                    break;
                }
            }
            if(leader)
                answer.add(nums[i]);
        }
        return answer;
    }
    public static List<Integer> findLeaderUsingSingleLoop(int[] nums){
        List<Integer> answer = new ArrayList<>();
        int largest = nums[nums.length-1];
        answer.add(nums[nums.length-1]);
        for(int i = nums.length-1; i>=0; i--){
//            int largest = nums[nums.length-1];
            if(nums[i]>largest){
                largest = nums[i];
                answer.add(nums[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums =  {10, 22, 12, 3, 0, 6};
        System.out.println("Leader elements using two loops are : "+findLeaderUsingTwoLoops(nums));
        System.out.println("Leader elements using single loops are : "+findLeaderUsingSingleLoop(nums));
    }
}
