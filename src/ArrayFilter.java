public class ArrayFilter {
    public static void main(String[] args) {
        // Filtering array elements based on a condition
        String[] orderIds = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179"};

        // Iterate through array and print elements starting with 'B'
        for (String orderId : orderIds) {
            if (orderId.startsWith("B")) {
                System.out.println(orderId);
            }
        }
    }
}