import java.util.Random;

public class SubscriptionDiscount {
    public static void main(String[] args) {
        // Subscription discount based on days until expiration
        Random random = new Random();
        int daysUntilExpiration = random.nextInt(12); // Range [0, 11]
        int discountPercentage = 0;

        // Set discount based on days remaining
        if (daysUntilExpiration == 1) {
            discountPercentage = 20;
        } else if (daysUntilExpiration <= 5) {
            discountPercentage = 10;
        }

        // Output messages based on expiration
        if (daysUntilExpiration < 1) {
            System.out.println("Your subscription has expired!");
        } else if (daysUntilExpiration == 1) {
            System.out.println("Your subscription expires within a day!");
            System.out.println("Renew now and save " + discountPercentage + " %!");
        } else if (daysUntilExpiration <= 5) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Renew now and save " + discountPercentage + " %!");
        } else if (daysUntilExpiration <= 10) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Your subscription will expire soon. Renew now!");
        }
    }
}