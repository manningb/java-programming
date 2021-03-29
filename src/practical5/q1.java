package practical5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number of double values\nEnter any alphabetical letter to stop");

        // initialise empty doubles array
        ArrayList<Double> doubles = new ArrayList<Double>();

        // read in array of doubles, one by one
        while (input.hasNextDouble()) {
            double i = input.nextDouble();
            doubles.add(i); // add to array
        }
        // calculate stats on the doubles
        double mean = mean(doubles);
        double std_dev = std_dev(doubles);

        // print out the stats
        System.out.printf("The mean is: %.2f\n", mean);
        System.out.printf("The standard deviation is: %.2f", std_dev);
        System.out.println("std_dev = " + std_dev);
    }

    private static double mean(ArrayList<Double> double_values){
        // set to 0 initially
        double sum = 0;
        for (double value : double_values) {
            sum += value; // add each value together
        }
        // divide by length to find mean
        double length = double_values.size();
        return sum/length;
    }

    private static double std_dev(ArrayList<Double> double_values) {
        // set to 0 initially
        double stdDevSum = 0;
        // calculate the mean of the values
        double mean = mean(double_values);
        for (double value : double_values) {
            // get std dev for each val
            stdDevSum += Math.pow(value-mean, 2);
        }
        // return std dev of the array
        return Math.sqrt(stdDevSum/(double_values.size()-1));
    }
}
