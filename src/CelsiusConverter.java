public class CelsiusConverter {
    public static void main(String[] args) {
        // Temperature conversion from Fahrenheit to Celsius
        int fahrenheit = 94;
        double celsius; // Use double for more precise result

        // Apply the conversion formula
        celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
        System.out.println("The temperature is " + celsius + " degrees Celsius");

        // Round to nearest whole number
        System.out.println("Rounded: " + Math.round(celsius) + " degrees Celsius");
    }
}