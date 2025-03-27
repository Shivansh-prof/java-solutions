// Problem statement
// Create class String Magic and write methods to :
// 1. Count UpperCase characters
// 2. Check if it has two consecutive identical characters
// 3. finds the rightmost digit in a given string
// 4. finds the longest word in a given sentence

public class StringMagic {
    
    /**
     * This method counts the number of uppercase letters in a given string.
     *
     * @param str The string to count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public static int countUppercaseLetters(String str) {
        if(str == null)
            return -1;
        Integer count = 0;
        for(int i =0 ; i<str.length() ; i++){
            if(Character.isUpperCase(str.charAt(i)))
                count ++;
        }
        return count;
    }

    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public static boolean hasConsecutiveDuplicates(String str) {
        if(str != null && str.length()>1 && str.length()<1000){
            for(int i = 1; i<str.length()-1; i++){
                if(str.charAt(i) == str.charAt(i-1))
                    return true;
            }
        }
        return false;
    }

    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public static int getRightmostDigit(String str) {
        System.out.println(str);
        if(str == null){
            return -1;
        }
        for (int i = str.length()-1; i>=0 ; i--){
            if(Character.isDigit(str.charAt(i))){
                System.out.println(str.charAt(i));
                return Character.getNumericValue(str.charAt(i));
            }
        }
        return -1;
    }

    /**
     * This method finds the longest word in a given sentence.
     *
     * @param sentence The sentence to find the longest word in.
     * @return The longest word in the sentence. If sentence is empty, return an empty string.
     */
    public static String findLongestWord(String sentence) {

        if(sentence == null || sentence.equals("")){
            return "";
        }
        String[] words = sentence.split(" ");
        String longestWord = "";
        for(String word:words){
            if(word.length()>longestWord.length()){
                longestWord=word;
            }
            
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String str = "Java is an object oriented3 programming7 language";
        System.out.println("Total Upper case characters are : "+ countUppercaseLetters(str));
        System.out.println("Check whether string contains consective duplicates : "+ hasConsecutiveDuplicates(str));
        System.out.println("If string contains digits and pring rigthmost : "+ getRightmostDigit(str));
        System.out.println("Longest word in the string is : " + findLongestWord(str));
    }
}