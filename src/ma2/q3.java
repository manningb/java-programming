package ma2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string representing any number of wins, draws and losses e.g. \"WWDLDL\"");
        // initialise variables and read input and check
        String results_in = input.nextLine();
        int points_returned = checkWDL(results_in);

        // while output from function is -1 (invalid) keep reading input
        while (points_returned == -1) {
            System.out.println("Invalid Format, enter again");
            results_in = input.nextLine();
            points_returned = checkWDL(results_in);
        }
    }
    private static int checkWDL(String results) {
        // HashMap maps the relevant result to the points
        // easy access and enables it to be changed in the future
        Map<Character, Integer> result_points = new HashMap<Character, Integer>() {{
            put('w', 3); // 3 points for win
            put('d', 1); // 1 point for draw
            put('l', 0); // 0 points for loss
        }};

        // initialise count for average later and total_points for total points
        int count = 0;
        int total_points = 0;
        results = results.toLowerCase();
        for (int i = 0; i < results.length(); i++) {
            char c = results.charAt(i);
            if (c == 'w' || c == 'd' || c == 'l') {
                count ++;
                // get value from hashmap for that result
                total_points += result_points.get(c);
            } else {
                // if an invalid character is found return -1
                return -1;
            }
        }
        // no invalid characters found
        System.out.println("Total points: " + total_points);
        System.out.println("Average points: " + (double) total_points/count);

        // return value of total_points
        return total_points;
    }
}
