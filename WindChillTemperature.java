import java.util.Scanner;

public class WindChillTemperature {
    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed: ");
        double windSpeed = sc.nextDouble();

        // Output the result
        System.out.println("Wind Chill: " + calculateWindChill(temperature, windSpeed));

    }
}
