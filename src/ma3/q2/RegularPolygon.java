package ma3.q2;

public class RegularPolygon {
    // initialise default values
    private int n = 3;
    private double length = 1;

    public RegularPolygon() {
        // no-arg constructor
        // initialises to default values
    }

    public RegularPolygon(int n, double length) {
        // arg constructor
        this.setN(n);
        this.setLength(length);
    }

    // various getters and setters
    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n < 0) {
            System.out.println("Number of sides " + n + " is not valid. Must be greater than 0. \nn set to default value " + this.n);
//            throw new IllegalArgumentException("Number of sides is not valid. Must be greater than or equal to 1.");
        } else {
            this.n = n;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <  0) {
            System.out.println("Length of side " + length + "is not valid. Must be greater than 0. \nLength set to default value " + this.length);
//            throw new IllegalArgumentException("Length of side must be greater than 0.");
        } else {
            this.length = length;
        }
    }

    // other methods
    public double getPerimeter() {
        // returns the perimeter of the polygon
        return this.n * this.length;
    }

    public double getArea() {
        // returns the area of the polygon
        return (this.n * Math.pow(this.length, 2)/(4 * Math.tan(Math.PI/this.n)));
    }

    @Override
    public String toString() {
        // returns string representation of an account
        return "RegularPolygon{" +
                "n=" + n +
                ", length=" + length +
                '}';
    }
}
