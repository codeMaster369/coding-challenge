import java.util.Random;

public class RandomOrderIds {
    public static void main(String[] args) {
        // Generating random order IDs with specific format
        Random random = new Random();
        String[] orderIDs = new String[5];

        // Generate 5 random order IDs
        for (int i = 0; i < orderIDs.length; i++) {
            // Generate random character A to E
            char prefixChar = (char) random.nextInt(65, 70); // ASCII: A=65, E=69
            String prefix = String.valueOf(prefixChar);

            // Generate random 3-digit number
            String suffix = String.format("%03d", random.nextInt(1, 1000)); // 001 to 999

            // Combine prefix and suffix
            orderIDs[i] = prefix + suffix;
        }

        // Print generated order IDs
        for (String orderID : orderIDs) {
            System.out.println(orderID);
        }
    }
}