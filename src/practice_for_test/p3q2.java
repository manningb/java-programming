package practice_for_test;

import java.util.Scanner;

public class p3q2 {
    public static void main(String[] args) {
        String input = stringInput("please input a string: ");
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            System.out.print(c);
        }
    }
    private static String stringInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

}
