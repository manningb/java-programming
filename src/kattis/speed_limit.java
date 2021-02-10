package kattis;

import java.util.Scanner;

public class speed_limit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first_input = input.nextInt();
        while (first_input != -1) {
            int[][] a = new int[first_input][3];
            int distance = 0;
            for (int i = 0; i < first_input; i++) {
                    a[i][0] = input.nextInt();
                    if (i == 0){
                        a[i][1] = input.nextInt();
                        distance = a[i][0] * a[i][1];
                    } else {
                        a[i][1] = input.nextInt();
                        distance += a[i][0] * (a[i][1] - a[i-1][1]) ;
                    }
            }
            System.out.println(distance + " miles");
            first_input = input.nextInt();
        }
    }
}
