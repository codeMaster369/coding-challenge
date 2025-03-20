import java.util.Random;

public class RandomDice {
    public static void main(String[] args) {
        // Generating random numbers using the Random class
        Random dice = new Random();

        // Generate a random integer
        int roll1 = dice.nextInt();
        System.out.println("First roll: " + roll1);

        // Generate a random integer in the range [0, 100]
        int roll2 = dice.nextInt(101); // 101 is exclusive
        System.out.println("Second roll: " + roll2);

        // Generate a random integer in the range [50, 100] (Java 17+)
        int roll3 = dice.nextInt(50, 101); // 101 is exclusive
        System.out.println("Third roll: " + roll3);
    }
}