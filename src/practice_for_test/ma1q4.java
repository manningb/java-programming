package practice_for_test;

import java.util.Scanner;

public class ma1q4 {
    public static void main(String[] args) {
        String string1 = lineInput("Please enter the first string: ");
        String string2 = lineInput("Please enter the second string: ");
        int less_len = Math.min(string1.length(), string2.length());
        boolean check = false;
        for (int i = 0; i < less_len; i++) {
            char c1 = string1.charAt(i);
            char c2 = string2.charAt(i);
            if (c1 == c2) {
                System.out.print(c1);
                check = true;
            } else {
                break;
            }
        }
        if (check == false) {
            System.out.println("no common prefix");
        }
    }

    private static String lineInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

}
