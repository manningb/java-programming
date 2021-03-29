package practical5;

import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        // initialise test arrays
        int[] test1 = {100, 1, 77, 20};
        int[] test2 = {};
        int[] test3 = {7, 7};
        int[] test4 = {1, 1, 33, 49, 1000};

        // run function for testing
        System.out.println("Test 1: "+isSorted(test1));
        System.out.println("Test 2: "+isSorted(test2));
        System.out.println("Test 3: "+isSorted(test3));
        System.out.println("Test 4: "+isSorted(test4));
    }

    private static boolean isSorted(int[] arr) {
        // set last val = min val of integer at the start
        int last_val = Integer.MIN_VALUE;
        boolean sorted = true; // set to true by default
        for (int value : arr) {
            if (value < last_val) {
                // if one value is greater than the prev set to false
                // break loop
                sorted = false;
                break;
            }
            last_val = value;
        }
        return sorted;
    }
}
