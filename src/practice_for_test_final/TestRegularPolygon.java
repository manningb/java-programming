package practice_for_test_final;

public class TestRegularPolygon {
    public static void main(String[] args) {

        RegularPolygon one = new RegularPolygon(3,10.0);
        RegularPolygon two = new RegularPolygon(6,7.5);
        RegularPolygon three = new RegularPolygon(8,3.5);
        RegularPolygon four = new RegularPolygon(12,4.0);
        RegularPolygon[] PolyArray = {one, two, three, four};

        double shortestPerimeter = PolyArray[0].getPerimeter();
        double largestArea = PolyArray[0].getArea();
        for (RegularPolygon elem:PolyArray) {
            elem.toString();
            System.out.println(elem.getArea());
            if (elem.getArea() > largestArea) {
                largestArea = elem.getArea();;
            }
            System.out.println(elem.getPerimeter());
            if (elem.getPerimeter() < shortestPerimeter) {
                shortestPerimeter = elem.getPerimeter();;
            }
        }
        System.out.println(largestArea);
        System.out.println(shortestPerimeter);
    }
}
