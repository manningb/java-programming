package practical3;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            String word = input.next();
            boolean isPal = isPalindrome(word);
            if (isPal) {
                System.out.println(word + " is a Palindrome");
            } else {
                    System.out.println(word + " is not a Palindrome");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length/2; i++) {
            char first_half = str.charAt(i);
            char second_half = str.charAt(length - 1 - i);
            if (first_half != second_half) {
                return false;
            }
        }
        return true;
    }
}
