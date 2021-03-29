package practice_for_test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p2q5 {
    public static void main(String[] args) {
        char in = letterInput("Please input a letter");
        System.out.printf("This letter \"%c\" is a %s", in, vowelOrCons(in));
    }

    private static String vowelOrCons(char letter) {
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};

        // Convert String Array to List
        List<String> list = Arrays.asList(vowels);
        if (list.contains(Character.toString(letter))){
            return "vowel";
        } else {
            return "consonant";
        }
    }

    private static char letterInput(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        char ch = input.next().charAt(0);
        while (!Character.isLetter(ch)) {
            System.out.println("Input is invalid");
            System.out.println(message);
            ch = input.next().charAt(0);
        }
        return ch;
    }
}
