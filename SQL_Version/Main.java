import java.sql.*;
import java.util.Scanner;

public class MainSQL {
    public static void main(String[] args) {
        final long TIME_WINDOW = 5000;
        Scanner sc = new Scanner(System.in);

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fraud_system", "root",
                    "ashish@2005");
            while (true) {
                System.out.print("Enter the User ID (or 'exit')");
                String userId = sc.nextLine().trim();

                if (userId.equalsIgnoreCase("exit")) {
                    break;
                }

                long now = System.currentTimeMillis();

                // storing transactions

                PreparedStatement insert = conn.prepareStatement(
                        "INSERT INTO transactions (user_id,timestamps) VALUES (?,?)");
                insert.setString(1, userId);
                insert.setLong(2, now);
                insert.executeUpdate();

                // checking transactions in last 60s
                PreparedStatement check = conn
                        .prepareStatement("SELECT COUNT(*) FROM transactions WHERE user_id = ? AND timestamps >= ?");
                check.setString(1, userId);
                check.setLong(2, now - TIME_WINDOW);
                ResultSet rs = check.executeQuery();

                rs.next();
                int count = rs.getInt(1);
                if (count > 1) {
                    System.out.println("⚠️ Fraud Alert for user: " + userId);
                } else {
                    System.out.println("✅ Transaction recorded for user: " + userId);
                }

            }
            sc.close();
            System.out.println("✅ System exited.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
