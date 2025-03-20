import java.util.Random;

public class DiceDecision {
    public static void main(String[] args) {
        // Simulating dice rolls and determining a win condition
        Random dice = new Random();
        int roll1 = dice.nextInt(6) + 1; // Range [1, 6]
        int roll2 = dice.nextInt(6) + 1;
        int roll3 = dice.nextInt(6) + 1;

        int total = roll1 + roll2 + roll3;
        System.out.println("Dice roll: " + roll1 + " + " + roll2 + " + " + roll3);

        // Check for triples
        if (roll1 == roll2 && roll2 == roll3) {
            System.out.println("You rolled triples! +6 bonus to total!");
            total += 6;
        }
        // Check for doubles
        else if (roll1 == roll2 || roll2 == roll3 || roll1 == roll3) {
            System.out.println("You rolled doubles! +2 bonus to total!");
            total += 2;
        }

        // Determine win or lose
        if (total >= 15) {
            System.out.println("You win!");
        } else {
            System.out.println("Sorry, you lose.");
        }
    }
}