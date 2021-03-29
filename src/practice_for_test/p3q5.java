package practice_for_test;

public class p3q5 {
    public static void main(String[] args) {
        patternA(6);
        patternB(6);
        patternC(6);
        patternD(6);
    }

    private static void patternA(int n) {
        System.out.println("Pattern A");
        for (int i = 0; i < n; i++) {
             for (int j = 0; j < i + 1; j++) {
                 System.out.print(j+1);
                 System.out.print(" ");
             }
            System.out.println("");
        }
    }

    private static void patternB(int n) {
        System.out.println("Pattern B");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    private static void patternC(int n) {
        System.out.println("Pattern C");
        for (int i = 0; i < n; i++) {
            System.out.print("  ".repeat(n - i));
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j+1);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    private static void patternD(int n) {
        System.out.println("Pattern D");
        for (int i = n; i > 0; i--) {
            System.out.print("  ".repeat(n - i));
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
