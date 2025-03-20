public class IncrementDecrementOrder {
    public static void main(String[] args) {
        // Demonstrating pre- and post-increment effects
        int value = 1;

        // Post-increment: value is used, then incremented
        value++;
        System.out.println("First: " + value); // Output: 2

        System.out.println("Second: " + value++); // Output: 2, then value becomes 3
        System.out.println("Third: " + value); // Output: 3

        // Pre-increment: value is incremented, then used
        System.out.println("First: " + (++value)); // Output: 4

        // Another example with both pre and post
        value = 1;
        ++value; // Value becomes 2
        value++; // Value becomes 3
        System.out.println("First: " + value); // Output: 3
    }
}