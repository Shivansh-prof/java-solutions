import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractice {

//    Question 1 : Filter even numbers form a list
    public static List<Integer> filterEvenUsingStreams(List<Integer> nums){
        return nums.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
    }

//    Question 2 : Convert a List of Strings to Uppercase
    public static List<String> convertToUppercaseUsingStream(List<String> words){
        return words.stream().map(String::toUpperCase).toList();
    }

//    Question 3 : Count strings starting with a specific letter
    public static long countWordsUsingStream(List<String> words, char character){
        return words.stream().filter(s-> s.startsWith(String.valueOf(character))).count();
    }

//    Question 4 : Find the first Element in the list
    public static Optional<Integer> findFirstElementUsingStream(List<Integer> nums){
        return nums.stream().findFirst();
    }

//    Question 5 : Sort the list of String
    public static List<String> sortStringUsingStream(List<String> words){
        return words.stream().sorted().collect(Collectors.toList());
    }

//    Question 6 : Remove duplicates from a list
    public static List<Integer> removeDuplicateUsingStream(List<Integer> nums){
        return nums.stream().distinct().toList();
    }

//    Question 7 : Count the number of elements in a list
    public static long countElementsUsingStream(List<Integer> nums){
        return nums.stream().count();
    }

//    Question 8 : find maximum number in a list
    public static Optional<Integer> findMaxUsingStream(List<Integer> nums){
        return nums.stream().max(Integer::compare);
    }

//    Question 9 : find minimum number in a list
    public static Optional<Integer> findMinUsingStream(List<Integer> nums){
        return nums.stream().min(Integer::compare);
    }

//    Question 10 : sum all numbers in a list
    public static Integer sumUsingStream(List<Integer> nums){
        return nums.stream().reduce(0, Integer::sum);
    }

//    Question 11 : join strings with a comma separator
    public static String joinStringUsingStream(List<String> words){
        return words.stream().collect(Collectors.joining(", ","[","]"));
    }

//    Question 12 : square each number in a list
    public static List<Integer> squareNumberUsingStream(List<Integer> nums){
        return nums.stream().map(x->x*x).toList();
    }

//    Question 13 : filter strings longer than 4 characters
    public static List<String> stringGreaterUsingStream(List<String> words){
        return words.stream().filter(s->s.length()>4).toList();
    }

//    Question 14 : convert list of strings to their lengths
    public static List<Integer> convertStringToLengthUsingStreams(List<String> words){
        return words.stream().map(String::length).toList();
    }

//    Question 15 : collect filtered elements into a set
    public static Set<Integer> convertToSetUsingStream(List<Integer> nums){
        return nums.stream().filter(x->x>4).collect(Collectors.toSet());
    }

//    Question 16 : find average of list of numbers
    public static Double findAverageUsingStream(List<Integer> nums){
        return nums.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

//    Question 17 : check if all numbers are positive
    public static Boolean checkIfPositiveUsingStreams(List<Integer> nums){
        return nums.stream().allMatch(x->x>0);
    }


//    Question 18 : check if any number is null
    public static Boolean checkIfNullUsingStreams(List<Integer> nums){
        return nums.stream().anyMatch(Objects::isNull);
    }

//    Question 19 : limit to first 5 elements
    public static List<Integer> firstFiveNumbersUsingStream(List<Integer> nums){
        return nums.stream().limit(5).toList();
    }

//    Question 20 : skip first 5 elements
    public static List<Integer> skipFiveNumbersUsingStream(List<Integer> nums){
        return nums.stream().skip(5).toList();
    }


    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,3,4,2,5,6,2,8,9,9,11,9,5,3,1,4,5,2);
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "date", "elderberry", "blueberry", "fig", "grape");

//        Q1
        System.out.println("filtered even number from array"+ filterEvenUsingStreams(nums));

//        Q2
        System.out.println("Converted to uppercase"+ convertToUppercaseUsingStream(words));

//        Q3
        System.out.println("Count words with given character " + countWordsUsingStream(words,'b'));

//        Q4
        Optional<Integer> firstElement = findFirstElementUsingStream(nums);
        if (firstElement.isPresent()){
            System.out.println("First element of list is "+firstElement.get());
        }else {
            System.out.println("List is empty");
        }

//        Q5
        System.out.println("Sorted list of string "+sortStringUsingStream(words));

//        Q6
        System.out.println("Removing duplicates from list "+ removeDuplicateUsingStream(nums));

//        Q7
        System.out.println("count elements in a list "+ countElementsUsingStream(nums));

//        Q8
        Optional<Integer> maxElement = findMaxUsingStream(nums);
        if (maxElement.isPresent()){
            System.out.println("maximum element of list is "+maxElement.get());
        }else {
            System.out.println("List is empty");
        }

//        Q9
        Optional<Integer> minElement = findMinUsingStream(nums);
        if (minElement.isPresent()){
            System.out.println("maximum element of list is "+minElement.get());
        }else {
            System.out.println("List is empty");
        }

//        Q10
        System.out.println("Sum of all numbers is "+sumUsingStream(nums));

//        Q11
        System.out.println("Combined string is "+joinStringUsingStream(words));

//        Q12
        System.out.println("Squares of numbers are"+ squareNumberUsingStream(nums));

//        Q13
        System.out.println("words with greater than 4 are "+ stringGreaterUsingStream(words));

//        Q14
        System.out.println("Length of strings are "+ convertStringToLengthUsingStreams(words));

//        Q15
        System.out.println("Filtered numbers into set "+convertToSetUsingStream(nums));

//        Q16
        System.out.println("average of numbers is "+findAverageUsingStream(nums));

//        Q17
        System.out.println("are all numbers positive : "+checkIfPositiveUsingStreams(nums));

//        Q18
        System.out.println("check if any numbers is null : "+checkIfNullUsingStreams(nums));

//        Q19
        System.out.println("first 5 numbers of list are : "+firstFiveNumbersUsingStream(nums));

//        Q20
        System.out.println("List after skipping first 5 numbers : "+skipFiveNumbersUsingStream(nums));
    }
}
