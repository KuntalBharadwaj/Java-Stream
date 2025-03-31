import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

class EmployeeDeserializer {
    @SuppressWarnings("unchecked")
    public static List<Employee> deserializeEmployees(String filename) {
        List<Employee> employees = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            employees = (List<Employee>) ois.readObject();
            System.out.println("✅ Employee list deserialized successfully from " + filename);
        } catch (IOException e) {
            System.err.println("❌ Error during deserialization: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("❌ Employee class not found: " + e.getMessage());
        }
        return employees;
    }
}