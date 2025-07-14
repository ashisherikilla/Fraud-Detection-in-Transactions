import java.util.*;

public class MainJava {
    public static void main(String[] args) {

        // fraud time declrataion
        final long TIME_WINDOW = 5000;

        Scanner sc = new Scanner(System.in);

        // storing user_id ,timestamps using Hashmap and Lists
        // user_id -> String
        // timestamps -> Long
        Map<String, List<Long>> TransactionMap = new HashMap<>();

        // initialising a condition to run code for everytime
        while (true) {
            System.out.println("Enter the UserID (or exit): ");
            // taking userid as an input
            String userID = sc.nextLine().trim();

            // case to exit
            // on comparing exit with input ignoring case Sensitivity
            if (userID.equalsIgnoreCase("exit")) {
                break;
            }

            // initializing the current time with converting into milliseconds
            long now = System.currentTimeMillis();

            // getting the data of userid if it exits or creating new data with that userid
            List<Long> times = TransactionMap.getOrDefault(userID, new ArrayList<>());

            // Remove old timestamps outside time window (sliding window)
            times.removeIf(t -> now - t > TIME_WINDOW);

            // Add current transaction
            times.add(now);

            // adding back to HashMap
            TransactionMap.put(userID, times);

            // checking for fraud
            if (times.size() > 1) {
                System.out.println("⚠️ Fraud Alert for user: " + userID);
            } else {
                System.out.println("✅ Transaction recorded for user: " + userID);
            }

        }
        sc.close();
        System.out.println("✅ Transaction recorded for user: ");

    }
}
