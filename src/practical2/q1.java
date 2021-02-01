package practical2;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner lengths = new Scanner(System.in);
        double[] triangle_lengths = new double[3];
        double[] triangle_sums = new double[3];
        boolean okay_triangle = true;

        for (int i = 0; i < triangle_lengths.length; i++) {
            System.out.println("Please enter length of side " + (i + 1));
            triangle_lengths[i] = lengths.nextDouble();
            //System.out.println(triangle_lengths[i]); // for testing input read in okay
        }
        triangle_sums[0] = triangle_lengths[1] + triangle_lengths[2];
        triangle_sums[1] = triangle_lengths[2] + triangle_lengths[0];
        triangle_sums[2] = triangle_lengths[0] + triangle_lengths[1];

        for (int i = 0; i < triangle_sums.length; i++) {
            if (triangle_sums[i] < triangle_lengths[i]){
                System.out.println("Error: length of " + (i + 1) + " is greater than the other two sides\nExiting program.");
                okay_triangle = false;
                break;
            } else {
                System.out.println("Length of " + (i + 1) + " is okay.");
            }
        }
        System.out.println("Triangle sides are okay.");
    }
}
