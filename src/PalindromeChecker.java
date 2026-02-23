import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeChecker {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a word: ");
                String str = sc.nextLine();

                Stack<Character> stack = new Stack<>();
                Queue<Character> queue = new LinkedList<>();

                // Insert into both
                for(int i = 0; i < str.length(); i++) {
                    stack.push(str.charAt(i));   // LIFO
                    queue.add(str.charAt(i));    // FIFO
                }

                boolean isPalindrome = true;

                // Compare
                while(!stack.isEmpty()) {
                    if(stack.pop() != queue.remove()) {
                        isPalindrome = false;
                        break;
                    }
                }

                if(isPalindrome)
                    System.out.println(str + " is a Palindrome");
                else
                    System.out.println(str + " is NOT a Palindrome");

                sc.close();



    }
}
