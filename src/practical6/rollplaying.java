package practical6;

import java.util.Random;
import java.util.Scanner;

public class rollplaying {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_val = scanner.nextInt();

        int[] maximumValues = {5, 6, 7};
        int[] diceRolls = {5, 10, 3};

        int action_score = 0;

        for (int i = 0; i < diceRolls.length; i++) {
            for (int j = 0; j < diceRolls[i]; j++) {
                int dice_roll = getRandomNumberInRange(0, maximumValues[i], 0 ,0);
                if (dice_roll == maximumValues[i]) {
                    action_score += 2;
                } else if (dice_roll >= maximumValues[i] / 2) {
                    action_score += 1;
                } else if (dice_roll == 1) {
                    action_score -= 1;
                }
                //action_score += maximumValues[i] ;
            }
        }
    }

    private static int getRandomNumberInRange(int i, int maximumValue, int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
