import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;
public class PalindromeChecker {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a word: ");
                String str = sc.nextLine();

                Deque<Character> deque = new LinkedList<>();

                // Insert characters into deque
                for(int i = 0; i < str.length(); i++) {
                    deque.addLast(str.charAt(i));
                }

                boolean isPalindrome = true;

                // Compare front & rear
                while(deque.size() > 1) {
                    if(deque.removeFirst() != deque.removeLast()) {
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
