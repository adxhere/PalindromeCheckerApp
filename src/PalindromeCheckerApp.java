import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for(int i = 0; i < word.length(); i++){
            stack.push(word.charAt(i));
            queue.add(word.charAt(i));
        }

        boolean isPalindrome = true;

        while(!stack.isEmpty()){

            if(stack.pop() != queue.remove()){
                isPalindrome = false;
                break;
            }

        }

        if(isPalindrome){
            System.out.println(word + " is a palindrome");
        }
        else{
            System.out.println(word + " is not a palindrome");
        }

    }
}