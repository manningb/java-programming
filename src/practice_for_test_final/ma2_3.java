package practice_for_test_final;

import java.util.Scanner;

public class ma2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string with wins and losses etc.");
        String results = input.nextLine();
        int points = 0;
        int count = 0;
        for (int i = 0; i < results.length(); i++) {
            if (results.charAt(i) == 'W') {
                points += 3;
                count += 1;
            } else if (results.charAt(i) == 'D') {
                points += 1;
                count += 1;
            } else if (results.charAt(i) == 'L') {
                points += 0;
                count += 1;
            }
        }
        System.out.println("Total Points = " + points);
        System.out.println("Average Points = " +  (float)points/count);
    }
}
