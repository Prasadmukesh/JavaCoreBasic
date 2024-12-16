public class TestDAO {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        
        // Insert employees
        employeeDAO.insertEmployee("John Doe", "Manager", 75000);
        employeeDAO.insertEmployee("Jane Smith", "Developer", 60000);
        
        // // View all employees
        // System.out.println("View All Employees:");
        // employeeDAO.viewAllEmployees();
        
        // // Update employee details
        // employeeDAO.updateEmployee(1, "John Doe", "Senior Manager", 80000);
        
        // // View a single employee
        // System.out.println("View Employee with ID 1:");
        // employeeDAO.viewEmployee(1);
        
        // // Delete an employee
        // employeeDAO.deleteEmployee(2);
        
        // // View all employees after deletion
        // System.out.println("View All Employees After Deletion:");
        // employeeDAO.viewAllEmployees();
    }
}

