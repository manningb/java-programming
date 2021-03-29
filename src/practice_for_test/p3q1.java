package practice_for_test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p3q1 {
    public static void main(String[] args) {
        String input = stringInput("Please input a string:");
        int vowels = 0;
        int cons = 0;
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            String vow_or_cons = vowelOrCons(c);
            if (vow_or_cons.equals("vowel")) {
                vowels++;
            } else if (vow_or_cons.equals("consonant")) {
                cons++;
            } else {
                System.out.println("Not a vowel/consonant");
            }
        }
        System.out.printf("There are %d vowels and %d consonsants", vowels, cons);
    }

    private static String stringInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.next();
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

}
