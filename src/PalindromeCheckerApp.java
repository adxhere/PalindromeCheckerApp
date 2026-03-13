class Node {
    char data;
    Node next;

    Node(char data){
        this.data = data;
        this.next = null;
    }
}

public class UseCase8PalindromeCheckerApp {

    static Node head = null;

    static void insert(char c){

        Node newNode = new Node(c);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    static boolean isPalindrome(){

        String original = "";
        String reversed = "";

        Node temp = head;

        while(temp != null){
            original += temp.data;
            temp = temp.next;
        }

        for(int i = original.length()-1; i >=0; i--){
            reversed += original.charAt(i);
        }

        return original.equals(reversed);
    }

    public static void main(String[] args) {

        String word = "level";

        for(char c : word.toCharArray()){
            insert(c);
        }

        if(isPalindrome()){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }

    }
}