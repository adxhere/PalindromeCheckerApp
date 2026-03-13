class PalindromeChecker {

    public boolean checkPalindrome(String word){

        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";

        PalindromeChecker checker = new PalindromeChecker();

        if(checker.checkPalindrome(word)){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }
    }
}