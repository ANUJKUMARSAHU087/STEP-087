import java.util.Scanner;
import java.util.Stack;
public class PalindromeChecker {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a word: ");
                String str = sc.nextLine();

                Stack<Character> stack = new Stack<>();

                // Push all characters into stack
                for(int i = 0; i < str.length(); i++) {
                    stack.push(str.charAt(i));
                }

                String reversed = "";

                // Pop characters (reverses automatically)
                while(!stack.isEmpty()) {
                    reversed = reversed + stack.pop();
                }

                // Compare
                if(str.equals(reversed)) {
                    System.out.println(str + " is a Palindrome");
                } else {
                    System.out.println(str + " is NOT a Palindrome");
                }

                sc.close();

    }
}
