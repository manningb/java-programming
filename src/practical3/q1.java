package practical3;

public class q1 {
    // first ten prime numbers
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        while (count < 10) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
            }
            i++;
        }
    }

    public static boolean isPrime(int number) {
        if (number == 0 || Math.abs(number) == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
