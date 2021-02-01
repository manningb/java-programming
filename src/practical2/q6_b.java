package practical2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q6_b {
    public static void main(String[] args) {
        Scanner year_in = new Scanner(System.in);
        System.out.println("Please enter the year");
        try {
            int year = year_in.nextInt();
            int remainder = year % 12;
            if (remainder == 0 )  {
                System.out.println("Monkey");
            }
            else if (remainder == 1 )  {
                System.out.println("Rooster");
            }
            else if (remainder == 2 )  {
                System.out.println("Dog");
            }
            else if (remainder == 3 )  {
                System.out.println("Pig");
            }
            else if (remainder == 4 )  {
                System.out.println("Rat");
            }
            else if (remainder == 5 )  {
                System.out.println("Ox");
            }
            else if (remainder == 6 )  {
                System.out.println("Tiger");
            }
            else if (remainder == 7 )  {
                System.out.println("Rabbit");
            }
            else if (remainder == 8 )  {
                System.out.println("Dragon");
            }
            else if (remainder == 9 )  {
                System.out.println("Snake");
            }
            else if (remainder == 10 )  {
                System.out.println("Horse");
            }
            else if (remainder == 11 )  {
                System.out.println("Sheep");
            }
        }
        catch (InputMismatchException exception){
            System.out.println("Integers only, please.");
        }

    }
}
