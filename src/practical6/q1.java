package practical6;

import java.util.Arrays;
import java.util.Random;

public class q1 {
    public static void main(String[] args) {
        double[][] randomArr = get2DArray();
        System.out.println(Arrays.deepToString(randomArr).replace("],", "],\n"));
        System.out.println(Arrays.toString(getMaxIndices(randomArr)));
    }

    public static int[] getMaxIndices(double[][] arr) {
        double max = 0;
        int[] index = {0,0};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                    index[0] = row;
                    index[1] = col;
                }
            }
        }
        return index;
    }

    public static double[][] get2DArray(){
        double[][] arr = new double[10][10];
        Random rand = new Random();
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = rand.nextInt(1000)/100;;
            }
        }
        return arr;
    }
}
