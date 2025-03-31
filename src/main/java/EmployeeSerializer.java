import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

class EmployeeSerializer {
    public static void serializeEmployees(List<Employee> employees, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employees);
            System.out.println("✅ Employee list serialized successfully to " + filename);
        } catch (IOException e) {
            System.err.println("❌ Error during serialization: " + e.getMessage());
        }
    }
}