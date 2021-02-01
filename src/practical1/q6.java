package practical1;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer between 0 and 999:");
        int inputIn = input.nextInt();
        if (inputIn >= 0 && inputIn <= 999) {
            int sum = 0;
            for (int i = 0; i < inputIn; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
