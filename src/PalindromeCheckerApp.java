import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "radar";

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : word.toCharArray()){
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while(deque.size() > 1){

            if(deque.removeFirst() != deque.removeLast()){
                isPalindrome = false;
                break;
            }

        }

        if(isPalindrome){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }
    }
}