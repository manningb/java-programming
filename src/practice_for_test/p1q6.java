package practice_for_test;

import java.util.Scanner;

public class p1q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input an integer between 0 and 999 inclusive: ");
        int intIn = input.nextInt();
        while (intIn < 0 || intIn > 999) {
            intIn = input.nextInt();
        }
        String strInt = Integer.toString(intIn);
        int sum = 0;
        for (int i = 0; i < strInt.length(); i++) {
            int current_value = Integer.parseInt(String.valueOf(strInt.charAt(i)));
            sum += current_value;
        }
        System.out.println(sum);
    }
}
