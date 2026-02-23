import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a word: ");
                String original = sc.nextLine();

                String reverse = "";

                // Reverse the string
                for(int i = original.length() - 1; i >= 0; i--) {
                    reverse = reverse + original.charAt(i);
                }

                // Check palindrome
                if(original.equals(reverse)) {
                    System.out.println(original + " is a Palindrome");
                } else {
                    System.out.println(original + " is NOT a Palindrome");
                }

                sc.close();

    }
}
