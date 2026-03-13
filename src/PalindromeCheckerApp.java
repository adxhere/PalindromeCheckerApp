public class UseCase13PalindromeCheckerApp {

    static boolean reverseMethod(String word){

        String reversed = "";

        for(int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        return word.equals(reversed);
    }

    static boolean twoPointerMethod(String word){

        int left = 0;
        int right = word.length() - 1;

        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "racecar";

        long start1 = System.nanoTime();
        boolean r1 = reverseMethod(word);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean r2 = twoPointerMethod(word);
        long end2 = System.nanoTime();

        System.out.println("Reverse Method Result: " + r1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println();

        System.out.println("Two Pointer Method Result: " + r2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");
    }
}