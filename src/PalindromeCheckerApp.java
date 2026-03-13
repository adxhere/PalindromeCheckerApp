public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "radar";

        char[] arr = word.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        boolean isPalindrome = true;

        while(left < right){

            if(arr[left] != arr[right]){
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if(isPalindrome){
            System.out.println(word + " is a palindrome");
        }
        else{
            System.out.println(word + " is not a palindrome");
        }

    }
}