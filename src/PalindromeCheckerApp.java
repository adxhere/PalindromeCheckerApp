public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "A man a plan a canal Panama";

        String normalized = text.replaceAll("\\s+","").toLowerCase();

        String reversed = "";

        for(int i = normalized.length()-1; i >= 0; i--){
            reversed += normalized.charAt(i);
        }

        if(normalized.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}