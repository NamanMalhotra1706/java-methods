public class UnitConverter2 {

    //Method to convert yards to feet
    public static double yardToFeet(double yard) {
        double yard2Feet = 3;
        return yard * yard2Feet;
    }

    //Method to convert feet to yard
    public static double feetToYard (double feet) {
        double feet2Yard = 0.333333;
        return feet * feet2Yard;
    }

    //Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    //Method to convert inches to meters
    public static double inchesToMeter(double inches) {
        double inches2Meter = 0.0254 ;
        return inches * inches2Meter;
    }

    //Method to convert inches to cm
    public static double inchesToCm(double inches) {
        double inches2Cm = 2.54 ;
        return inches * inches2Cm;
    }

    public static void main(String[] args) {
        
        double yard = 10.0;  
        double feet = yardToFeet(yard);
        System.out.println(yard + " yards is equal to " + feet + " feet.");

        double feetInput = 10.0;
        double yardOutput = feetToYard(feetInput);
        System.out.println(feetInput + " feet is equal to " + yardOutput + " yards.");

        double meters = 100.0; 
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inch.");

        double inchesInput = 100.0; 
        double metersOutput = inchesToMeter(inchesInput);
        System.out.println(feetInput + " feet is equal to " + metersOutput + " meters.");
       
        double inchesIn = 100.0; 
        double cmOutput = inchesToCm(inchesIn);
        System.out.println(feetInput + " feet is equal to " + cmOutput + " cm.");
    }
}
