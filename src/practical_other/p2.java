package practical_other;

public class p2 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x);
        foo(x);
        System.out.println("After the call, x is " + x);
    }

    public static void foo(int n) {
        System.out.println("\t Inside the method, n is " + n);
        n *= 10;
        System.out.println("\t Inside the method, n is " + n);
    }
}
