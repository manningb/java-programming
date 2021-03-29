package ma1;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter speed: ");
        double speed = in.nextDouble();
        System.out.print("Enter acceleration: ");
        double acceleration = in.nextDouble();
        
        // could use Math.pow(speed, 2) here.
        double length = (speed * speed) / (2 * acceleration);
        
        System.out.print("Is the runway wet or dry? (w/d): ");
        char c = in.next().charAt(0);
        c = Character.toLowerCase(c);
        if(c == 'd') {
        	System.out.printf("The minimum runway length for is %.2f\n", length);
        }else if(c == 'w') {
        	System.out.printf("The minimum runway length for this airplane is %.2f\n", (length*1.15));
        }else {
        	System.out.print("Please enter 'w' or 'd'");
        }
        in.close();

	}

}
