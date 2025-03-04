import java.lang.Math;

public class Trigonometry {

    // Method to calculate trigonometric functions: sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        
        double radians = Math.toRadians(angle);

        
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        // Store results in an array
        double[] results = {sinValue, cosValue, tanValue};

        return results;
    }

    public static void main(String[] args) {

        double angle = 45.0;

        // results
        double[] results = calculateTrigonometricFunctions(angle);

        // Output the results
        System.out.println("For an angle of " + angle + " degrees:");
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}
