package practice_for_test;

import java.util.Scanner;

public class p3q3 {
    public static void main(String[] args) {
        String input = lineInput("Please input a string: ");
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                char next_char = (char) ((int) c + 1);
                System.out.print(next_char);
            } else {
                System.out.print(c);
            }
        }
    }
    private static String lineInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

}
