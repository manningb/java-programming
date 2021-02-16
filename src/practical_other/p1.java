package practical_other;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the pattern size: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            String line = "";
            for (int j = 1; j <= i; j++) {
                line += j + " ";

            }
            System.out.println(line);
        }
        input.close();
    }

}
