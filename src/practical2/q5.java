package practical2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};

        // Convert String Array to List
        List<String> list = Arrays.asList(vowels);

        if (Character.isLetter(ch)) {
            System.out.println("Input is valid");
            if (list.contains(Character.toString(ch))){
                System.out.println("Letter is a vowel");
            } else {
                System.out.println("Letter is a consonant");
            }
        } else {
            System.out.println("Input is invalid. Please enter a letter.");
        }
    }
}
