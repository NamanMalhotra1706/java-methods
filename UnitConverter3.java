public class UnitConverter3 {

    //Method to convert Farhenheit To Celsius
    public static double farhenheitToCelsius(double farhenheit) {
        double farhenheitTocelsius = (farhenheit - 32) * 5 / 9;
        return farhenheitTocelsius;
    }

    //Method to convert celsius to farhenheit
    public static double celsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    //Method to convert pounds to kilograms
    public static double poundsTokilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds*pounds2kilograms;
    }

    //Method to convert kilograms to pounds
    public static double kilogramsTopounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    //Method to convert gallon to Liters
    public static double gallonToLiters(double gallon) {
        double galon2Liters = 3.78541 ;
        return galon2Liters*gallon;
    }

    //Method to convert liters to gallon
    public static double litersToGallon(double liters) {
        double liters2Gallon = 0.264172;
        return liters2Gallon*liters;
    }

    public static void main(String[] args) {
        
        double farhenheit = 10.0;  
        double farhenheitTocelsius =  farhenheitToCelsius(farhenheit) ;
        System.out.println( farhenheit + " farhenheit is equal to " + farhenheitTocelsius + " celcius.");

        double celcius = 10.0;
        double celsiusToFarhenheit = celsiusToFarhenheit(celcius);
        System.out.println(celcius + " celcius is equal to " + celsiusToFarhenheit + " farhenheit.");

        double pounds = 10.0;
        double poundsToKg = poundsTokilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + poundsToKg + " kilograms.");

        double kilograms = 10.0;
        double kgToPounds = kilogramsTopounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + kgToPounds + " pounds.");

        double gallons = 10.0;
        double gallonsToLiters = gallonToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + gallonsToLiters + " liters.");

        double liters = 10.0;
        double litersToGallon = litersToGallon(liters);
        System.out.println(liters + " liters is equal to " + litersToGallon + " gallons.");
        
    }
}
