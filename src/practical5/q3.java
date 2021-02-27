package practical5;

import java.util.ArrayList;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number of double values\nEnter any alphabetical letter to stop");
        // initialise array list (dynamic size)
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        // add doubles to the array
        while (input.hasNextInt()) {
            int i = input.nextInt();
            intArray.add(i);
        }
        // check if there#s four consecutive integers in the array
        if (isConsecutiveFour(intArray)) {
            System.out.println("Contains four consecutive integers");
        } else {
            System.out.println("Does not contain four consecutive integers");
        }
    }

    private static boolean isConsecutiveFour(ArrayList<Integer> arr) {
        // initialise variables to 0
        int count = 0; // count number of matches
        int loop_count = 0; // if first loop, don't check
        int last_val = 0; // keep track of the last value in the array

        // loop through the values in the array
        for (int value : arr) {
            if (loop_count == 0) {
                loop_count++;
                last_val = value;
                continue;
            }
            if (value == last_val) {
                count++;
                if (count == 3){
                    // once 3 matches are found, there are 4 consecutive integers
                    return true;
                }
            } else {
                // set count =  0 if one is not the same value as last (Reset)
                count = 0;
            }
            last_val = value;
        }
        return false;
    }
}
