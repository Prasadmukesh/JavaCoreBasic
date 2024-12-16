import java.sql.*;

public class EmployeeDAO {

    // Insert an employee
    public void insertEmployee(String name, String position, double salary) {
        String query = "INSERT INTO employees (name, position, salary) VALUES (?, ?, ?)";
        
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setString(1, name);
            statement.setString(2, position);
            statement.setDouble(3, salary);
            
            int rowsAffected = statement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
        } catch (SQLException e) {
           // e.printStackTrace();
        }
    }
}

