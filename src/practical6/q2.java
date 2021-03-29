package practical6;

import java.util.Arrays;
import java.util.Random;

public class q2 {
    public static void main(String[] args) {
        double[][] randomArr = get2DArray(10);
        System.out.println(Arrays.deepToString(randomArr).replace("],", "],\n"));
        double m[][] = { { 1, 0, 0 },
                { 0.5, 0, 0.5 },
                { 0, 0, 1 } };

        System.out.println(isMarkovMatrix(m));
    }

    public static boolean isMarkovMatrix(double[][] arr) {
        double max = 0;
        int[] index = {0,0};
        for (int row = 0; row < arr.length; row++) {
            double col_sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < 0) {
                    return false;
                }
                col_sum += arr[row][col];
                }
            if (col_sum != 1) {
                return false;
            }
        }
        return true;
    }

    public static double[][] get2DArray(int n){
        double[][] arr = new double[n][n];
        Random rand = new Random();
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = rand.nextInt(1000)/100;;
            }
        }
        return arr;
    }

}
