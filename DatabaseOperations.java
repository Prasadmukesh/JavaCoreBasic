import java.sql.*;
import java.util.logging.*;

public class DatabaseOperations {
    
    private static final Logger logger = Logger.getLogger(DatabaseOperations.class.getName());
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USER = "root";
    private static final String PASS = "password";
    
    public static void main(String[] args) {
        DatabaseOperations dbOperations = new DatabaseOperations();
        dbOperations.run();
    }

    // Main method to control the flow
    public void run() {
        try {
            // Attempt to connect to the database and insert data
            Connection connection = connectToDatabase();
            insertData(connection, "John Doe", 25);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "SQL Error occurred: ", e);
        } catch (ClassNotFoundException e) {
            logger.log(Level.SEVERE, "JDBC Driver not found: ", e);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Unexpected error: ", e);
        } finally {
            // Always close resources in the 'finally' block
            closeResources();
        }
    }

    // Connect to the database
    private Connection connectToDatabase() throws SQLException, ClassNotFoundException {
        try {
            // Load the JDBC driver (Class.forName is used for older versions, it is not required in newer versions of JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Failed to connect to database: ", e);
            throw e; // Rethrow the exception after logging
        }
    }

    // Insert data into the database
    private void insertData(Connection connection, String name, int age) {
        String sql = "INSERT INTO users (name, age) VALUES (?, ?)";
        
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
            logger.info("Data inserted successfully.");
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Error inserting data: ", e);
        }
    }

    // Close database resources
    private void closeResources() {
        try {
            // Assuming we're dealing with a connection and statement, which we should always close
            // Since we're using try-with-resources above, this is just an example placeholder
            logger.info("Closing resources.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error closing resources: ", e);
        }
    }
}
