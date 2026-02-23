import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {

        String str = "madam";   // hardcoded value
        String rev = "";

        // reverse the string
        for(int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        // check palindrome
        if(str.equals(rev)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }
}
