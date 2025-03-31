import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public static void main(String[] args) {
        String filename = "employees.ser";

        // Create Employee List
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Alice", "HR", 50000));
        employeeList.add(new Employee(102, "Bob", "IT", 70000));
        employeeList.add(new Employee(103, "Charlie", "Finance", 60000));

        // Serialize Employee List
        EmployeeSerializer.serializeEmployees(employeeList, filename);

        // Deserialize Employee List
        List<Employee> retrievedEmployees = EmployeeDeserializer.deserializeEmployees(filename);

        // Display Retrieved Employees
        System.out.println("\n📜 Retrieved Employees:");
        for (Employee emp : retrievedEmployees) {
            emp.display();
        }
    }
}