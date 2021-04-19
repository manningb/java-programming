package practice_for_test_final;

public class RegularPolygon {
    private int n = 3;
    private double length = 1;

    public RegularPolygon() {
    }

    public RegularPolygon(int n, double length) {
        this.n = n;
        this.length = length;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n < 1) {
            System.out.println("Invalid Input");
        } else {
            this.n = n;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 1) {
            System.out.println("Invalid Input");
        } else {
            this.length = length;
        }
    }

    public double getPerimeter() {
        return n * length;
    }

    public double getArea() {
        double area = (n * Math.pow(length,2))/(4 * Math.tan(Math.PI/n));
        return area;
    }

    @Override
    public String toString() {
        return "RegularPolygon{" +
                "n=" + n +
                ", length=" + length +
                '}';
    }
}
