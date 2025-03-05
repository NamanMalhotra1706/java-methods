import java.util.Scanner;

public class EuclideanDistance {

    // Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));  
    }

    // equation of the line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);
        result[0] = m;
        result[1] = b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coordinates of point 1 (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter the coordinates of point 2 (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the points: " + distance);

        // line equation and display the result
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double intercept = lineEquation[1];

        System.out.println("The equation of the line is: y = " + slope + "x + " + intercept);
    }
}
