// Problem statement

// You are given an array arr[] containi/ng positive integers. 
// The elements in the array arr[] range from 1 to n (where n is the size of the array), 
// and some numbers may be repeated or absent. 
// Your task is to count the frequency of all numbers in the range 1 to n and 
// return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).
import java.util.*;

class CountFrequency {
    public static List<Integer> frequencyCount(int[] arr) {

        int n = arr.length;
        List<Integer> array = new ArrayList();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0 ; i <n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i = 1; i <= n; i++) {
            array.add(map.getOrDefault(i, 0));
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        System.out.println("frequency of elements is : "+ frequencyCount(arr));
    }
}