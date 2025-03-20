public class IncrementDecrement {
    public static void main(String[] args) {
        // Simple demonstration of increment and decrement operators
        int value = 1;

        // Long form increment
        value = value + 1; // Add 1 to value
        System.out.println("First Increment: " + value);

        // Short form increment
        value += 1; // Equivalent to value = value + 1
        System.out.println("Second Increment: " + value);

        // Post-increment
        value++; // Increment value after its current value is used
        System.out.println("Third Increment: " + value);

        // Long form decrement
        value = value - 1; // Subtract 1 from value
        System.out.println("First Decrement: " + value);

        // Short form decrement
        value -= 1; // Equivalent to value = value - 1
        System.out.println("Second Decrement: " + value);

        // Post-decrement
        value--; // Decrement value after its current value is used
        System.out.println("Third Decrement: " + value);
    }
}