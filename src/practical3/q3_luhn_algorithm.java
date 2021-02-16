package practical3;

import java.util.Scanner;

public class q3_luhn_algorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String cardNum = input.nextLine();
            if (isValid(cardNum)) {
                System.out.println(cardNum + " is a valid card number.");
            } else {
                System.out.println(cardNum + " is not a valid card number");
            }
        }
    }

    public static boolean isValid(String cardStr) {
        cardStr = cardStr.replaceAll("\\s+","");
        int length = cardStr.length();
        if (length > 16 || length < 13) {
            // length of the card number is either too short or too long
            return false;
        } else if (!(cardStr.charAt(0) == '4' || cardStr.charAt(0) == '5' || cardStr.substring(0, 2).equals("37")|| cardStr.charAt(0) == '6')) {
            // prefix is incorrect
            return false;
        } else {
            int sum = 0;
            for (int i = length - 2; i >= 0; i -= 2) {
                int valNum = (cardStr.charAt(i) - '0') * 2;
                if (valNum > 9) {
                    valNum = (valNum - 10) + 1;
                }
                sum += valNum;
            }
            for (int i = length - 1; i >= 0; i -= 2) {
                sum += (cardStr.charAt(i) - '0');
            }
            return sum % 10 == 0;
        }
    }
}
