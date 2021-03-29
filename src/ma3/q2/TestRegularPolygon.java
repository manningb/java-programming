package ma3.q2;

public class TestRegularPolygon {
    public static void main(String[] args) {
        // initialise array and each polygon
        RegularPolygon[] polygonArray = new RegularPolygon[4];
        polygonArray[0] = new RegularPolygon(3, 10.0);
        polygonArray[1] = new RegularPolygon(6, 7.5);
        polygonArray[2] = new RegularPolygon(8, 3.5);
        polygonArray[3] = new RegularPolygon(12, 4.0);

        // initialise min max variables
        int maxAreaIndex = 0;
        int minPerimeterIndex = 0;

        // print out toString, perimeter, area and get min max
        for (int i = 0; i < polygonArray.length; i++) {
            System.out.println(polygonArray[i]);
            double perimeter = polygonArray[i].getPerimeter();
            if (i == 0 || perimeter < polygonArray[minPerimeterIndex].getPerimeter() ) {
                minPerimeterIndex = i;
            }
            System.out.println("Perimeter of polygon "+ i +" is " + perimeter);

            double area = polygonArray[i].getArea();
            if (i == 0 || area > polygonArray[maxAreaIndex].getArea() ) {
                maxAreaIndex = i;
            }
            System.out.println("Area of polygon "+ i +" is " + area + "\n");
        }

        // print out min max
        System.out.println("Minimum perimeter: " + polygonArray[minPerimeterIndex].getPerimeter() + "\nThis area belongs to " + polygonArray[minPerimeterIndex] + "\n");
        System.out.println("Maximum area: " + polygonArray[maxAreaIndex].getArea() + "\nThis area belongs to " + polygonArray[maxAreaIndex]);
    }
}
