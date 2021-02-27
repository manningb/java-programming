package practical5;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        String[] words =   //choose secret word from these
                {"geography", "cat", "yesterday", "java", "truck", "opportunity",
                        "fish", "token", "transportation", "bottom", "apple", "cake",
                        "remote", "boots", "terminology", "arm", "cranberry", "tool",
                        "caterpillar", "spoon", "watermelon", "laptop", "toe", "toad",
                        "fundamental", "capitol", "garbage", "anticipate", "pesky"};

        // play variable, indicates whether user would like to play again
        boolean play = true;
        do {
            // get random word from word list
            Random rand = new Random();
            String random = words[rand.nextInt(words.length)];
            random = random.toLowerCase();

            // generate the blanks
            char[] blanks = generateBlanks(random);
            Scanner input = new Scanner(System.in);

            // initialise counts
            int count_guess = 0;
            int misses = 0;

            // loop while number of correct letters less than length of word
            while (count_guess < random.length()) {
                // convert the blanks array to a string for printing
                String stringed_blanks = String.valueOf(blanks);
                System.out.printf("Guess a letter [%s] > ", stringed_blanks);

                // take one character as input
                char guess = input.next().charAt(0);

                // check if a letter was found
                boolean check = false;

                // loop through word to find matches
                for (int i = 0; i < random.length(); i++) {
                    // check if already inputted
                    if (Character.toLowerCase(guess) == blanks[i]) {
                        System.out.printf("'%s' is already in the word\n", blanks[i]);
                        check = true;
                        break;
                    } else if (random.charAt(i) == Character.toLowerCase(guess)) {
                        // set blank equal to character if found - keep looping to find more matches
                        blanks[i] = Character.toLowerCase(guess);
                        check = true;
                        count_guess++;
                    }
                }
                if (!check) {
                    // if check is false at the end increase misses count
                    System.out.printf("%c is not in the word\n", guess);
                    misses++;
                }
            }
            // message once user has won
            System.out.printf("\tYou win! The word is [%s]. You missed %d times.\n\n", random, misses);
            System.out.println("Enter 'y' to play again or any other character to exit > ");
            // read in char, if y keep playing
            char playChar = input.next().charAt(0);
            play = playChar == 'y';
        } while (play);

    }

    private static char[] generateBlanks(String random){
        // function to generate blanks array
        String blanks = "";
        for (int i = 0; i < random.length(); i++) {
            blanks += "*";
        }
        return blanks.toCharArray();
    }

}
