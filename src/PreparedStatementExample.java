import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) {
        // JDBC URL, username, and password
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "username";
        String password = "password";

        // SQL query with placeholders for parameters
        String sql = "INSERT INTO users (username, email) VALUES (?, ?)";

        try (
                // Establish a connection to the database
                Connection connection = DriverManager.getConnection(url, username, password);

                // Create a PreparedStatement object with the SQL query
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ) {
            // Set values for parameters in the prepared statement
            preparedStatement.setString(1, "john_doe");
            preparedStatement.setString(2, "john@example.com");

            // Execute the prepared statement
            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            } else {
                System.out.println("Failed to insert a new user!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
