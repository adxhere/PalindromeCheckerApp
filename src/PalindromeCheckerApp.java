public class UseCase9PalindromeCheckerApp {

    static boolean checkPalindrome(String str, int start, int end){

        if(start >= end){
            return true;
        }

        if(str.charAt(start) != str.charAt(end)){
            return false;
        }

        return checkPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "madam";

        boolean result = checkPalindrome(word, 0, word.length()-1);

        if(result){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }

    }
}