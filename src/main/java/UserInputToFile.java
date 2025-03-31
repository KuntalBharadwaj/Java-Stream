import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        // Define the file where data will be stored
        String fileName = "user_data.txt";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(fileName, true)) { // Append mode

            // Ask for user input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write data to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");
            writer.write("----------------------\n");

            System.out.println("\n✅ Data saved successfully to " + fileName);

        } catch (IOException e) {
            System.err.println("❌ Error occurred while reading/writing data: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("❌ Invalid input for age. Please enter a valid number.");
        }
    }
}
