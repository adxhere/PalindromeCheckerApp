import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

/* Strategy Interface */
interface PalindromeStrategy {
    boolean check(String word);
}

/* Stack Strategy */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String word){

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()){
            stack.push(c);
        }

        String reversed = "";

        while(!stack.isEmpty()){
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }
}

/* Deque Strategy */
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String word){

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : word.toCharArray()){
            deque.addLast(c);
        }

        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                return false;
            }
        }

        return true;
    }
}

/* Application */
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        PalindromeStrategy strategy;

        strategy = new StackStrategy();

        if(strategy.check(word)){
            System.out.println("StackStrategy: Palindrome");
        }else{
            System.out.println("StackStrategy: Not Palindrome");
        }

        strategy = new DequeStrategy();

        if(strategy.check(word)){
            System.out.println("DequeStrategy: Palindrome");
        }else{
            System.out.println("DequeStrategy: Not Palindrome");
        }
    }
}